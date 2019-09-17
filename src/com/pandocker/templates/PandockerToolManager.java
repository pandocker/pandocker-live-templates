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
                "/tools/pandocker", "PandockerPlugin");
    }

    protected SchemeProcessor<ToolsGroup<Tool>, ToolsGroup<Tool>> createProcessor() {
        return new ToolsProcessor<Tool>() {
            protected ToolsGroup<Tool> createToolsGroup(String groupName) {
                return new ToolsGroup<>(groupName);
            }

            protected Tool createTool() {
                return new Tool();
            }
        };
    }

    protected String getActionIdPrefix() {
        return "Tool_";
    }
}
