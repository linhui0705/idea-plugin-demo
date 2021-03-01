package net.coderlin.plugin.demo.data;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;

public class DataCenter {
    public static String SELECTED_TEXT;
    public static String FILE_NAME;
    public static List<NoteData> NOTE_LIST = new LinkedList<>();
    public static String[] HEAD = new String[]{"标题", "备注", "文件名", "代码段"};
    public static DefaultTableModel TABLE_MODEL = new DefaultTableModel(null, HEAD);
}
