package net.coderlin.plugin.demo.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class NoteListWindow {
    private JTextField tfTopic;
    private JTable tbContent;
    private JButton btnCreate;
    private JButton btnClear;
    private JButton btnClose;
    private JPanel contentPanel;

    public NoteListWindow(Project project, ToolWindow toolWindow) {
        btnCreate.addActionListener(e -> {
        });
        btnClear.addActionListener(e -> {
        });
        btnClose.addActionListener(e -> {
        });
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
