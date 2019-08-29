package com.pandocker.templates;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class PandockerLiveTemplateProvider  implements DefaultLiveTemplatesProvider {
    public PandockerLiveTemplateProvider() {
    }

    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"liveTemplates/pandockertemplates"};
    }

    @Nullable
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }

}
