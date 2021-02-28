package net.coderlin.plugin.demo.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.EditorTextField;
import net.coderlin.plugin.demo.data.DataCenter;
import net.coderlin.plugin.demo.data.NoteData;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class AddNoteDialog extends DialogWrapper {
    private EditorTextField titleTextField;
    private EditorTextField contentTextField;

    public AddNoteDialog() {
        super(true);
        setTitle("添加笔记注释");
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        titleTextField = new EditorTextField("笔记标题");
        contentTextField = new EditorTextField("笔记内容");
        contentTextField.setPreferredSize(new Dimension(200, 100));
        panel.add(titleTextField, BorderLayout.NORTH);
        panel.add(contentTextField, BorderLayout.CENTER);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("添加笔记到列表");
        button.addActionListener(e -> {
            String title = titleTextField.getText();
            String content = contentTextField.getText();
            String suffix = DataCenter.FILE_NAME.substring(DataCenter.FILE_NAME.lastIndexOf(".") + 1);
//            System.out.println("title: " + title + ", content: " + content);
            NoteData noteData = new NoteData(title, content, DataCenter.SELECTED_TEXT, DataCenter.FILE_NAME, suffix);
            DataCenter.NOTE_LIST.add(noteData);
            System.out.println(DataCenter.NOTE_LIST);
        });
        panel.add(button);
        return panel;
    }
}
