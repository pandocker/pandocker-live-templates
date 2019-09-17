package com.pandocker.templates;

import com.intellij.tools.*;

import java.util.List;

public class PandockerToolProvider extends ExternalToolsGroup {
    private PandockerToolManager toolManager = new PandockerToolManager();

    public PandockerToolProvider() {
    }

    protected List<ToolsGroup<Tool>> getToolsGroups() {
        return toolManager.getGroups();
    }

    protected List<Tool> getToolsByGroupName(String groupName) {
        return toolManager.getTools(groupName);
    }

    protected ToolAction createToolAction(Tool tool) {
        return new ToolAction(tool);
    }

}
