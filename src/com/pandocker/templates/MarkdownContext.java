package com.pandocker.templates;
// as-is copy from
// https://www.jetbrains.org/intellij/sdk/docs/tutorials/live_templates/template_support.html#implement-templatecontexttype

import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class MarkdownContext extends TemplateContextType {
    protected MarkdownContext() {
        super("MARKDOWN", "Markdown");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".md");
    }
}
