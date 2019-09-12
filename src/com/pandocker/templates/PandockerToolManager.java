package com.pandocker.templates;

import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.options.SchemeManagerFactory;
import com.intellij.openapi.options.SchemeProcessor;
import com.intellij.tools.BaseToolManager;
import com.intellij.tools.Tool;
import com.intellij.tools.ToolsGroup;
import com.intellij.tools.ToolsProcessor;

public class PandockerToolManager extends BaseToolManager<Tool> {
    PandockerToolManager() {
        super(ActionManagerEx.getInstanceEx(), SchemeManagerFactory.getInstance(),
                "tools/pandocker", "PandockerPlugin");
    }

    @Override
    protected SchemeProcessor<ToolsGroup<Tool>, ToolsGroup<Tool>> createProcessor() {
        return new ToolsProcessor<Tool>() {
            @Override
            protected ToolsGroup<Tool> createToolsGroup(String groupName) {
                return new ToolsGroup<>(groupName);
            }

            @Override
            protected Tool createTool() {
                return new Tool();
            }
        };
    }

    @Override
    protected String getActionIdPrefix() {
        return "PandockerPlugin_";
    }
}
