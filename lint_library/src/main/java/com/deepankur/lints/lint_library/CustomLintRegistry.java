package com.deepankur.lints.lint_library;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import com.sun.istack.NotNull;

import java.util.Arrays;
import java.util.List;

public class CustomLintRegistry extends IssueRegistry {

    @NotNull
    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(TextAppearanceIssue.ISSUE);
    }
}