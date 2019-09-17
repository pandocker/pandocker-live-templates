package com.pandocker.templates;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PandockerWindow implements ToolWindowFactory {
    // Create the tool window content.
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        JComponent parent = toolWindow.getComponent();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello World!!");
        panel.add(label);
        parent.add(panel);
    }
}
