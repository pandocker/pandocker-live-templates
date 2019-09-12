package com.pandocker.templates;

import com.intellij.tools.Tool;
import com.intellij.tools.ToolsProvider;

import java.util.List;

public class PandockerToolProvider extends ToolsProvider {
    private PandockerToolManager toolManager = new PandockerToolManager();

    public PandockerToolProvider() {
    }

    @Override
    public List<Tool> getTools() {

        return this.toolManager.getTools();
    }
}
