package net.coderlin.plugin.demo.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TauntDialog extends DialogWrapper {

    private JLabel label;

    public TauntDialog() {
        super(true);
        this.setTitle("每天一碗毒鸡汤");
        label = new JLabel();
        this.init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        label.setText("毒鸡汤的内容");
        panel.add(label);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("再干一碗");
        button.addActionListener(e -> {
            label.setText("毒鸡汤的内容+1");
        });
        panel.add(button);
        return panel;
    }
}
