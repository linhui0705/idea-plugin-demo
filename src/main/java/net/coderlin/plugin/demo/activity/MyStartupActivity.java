package net.coderlin.plugin.demo.activity;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import net.coderlin.plugin.demo.dialog.TauntDialog;
import org.jetbrains.annotations.NotNull;

public class MyStartupActivity implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        System.out.println("MyStartupActivity runActivity");
        TauntDialog dialog = new TauntDialog();
        dialog.show();
    }
}
