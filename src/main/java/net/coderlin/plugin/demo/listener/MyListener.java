package net.coderlin.plugin.demo.listener;

import com.intellij.ide.AppLifecycleListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.intellij.openapi.ui.Messages;
import net.coderlin.plugin.demo.dialog.TauntDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MyListener implements AppLifecycleListener {
    @Override
    public void appFrameCreated(@NotNull List<String> commandLineArgs) {
        System.out.println("appFrameCreated");
    }

    @Override
    public void welcomeScreenDisplayed() {
        System.out.println("welcomeScreenDisplayed");
    }

    @Override
    public void appStarting(@Nullable Project projectFromCommandLine) {
        System.out.println("appStarting");
    }

    @Override
    public void projectFrameClosed() {
        System.out.println("projectFrameClosed");
        Messages.showMessageDialog("projectFrameClosed", "Hello World", Messages.getInformationIcon());
    }

    @Override
    public void projectOpenFailed() {
        System.out.println("projectOpenFailed");
        Messages.showMessageDialog("projectOpenFailed", "Hello World", Messages.getInformationIcon());
    }

    @Override
    public void appClosing() {
        System.out.println("appClosing");
        Messages.showMessageDialog("appClosing", "Hello World", Messages.getInformationIcon());
    }

    @Override
    public void appWillBeClosed(boolean isRestart) {
        System.out.println("appWillBeClosed");
        Messages.showMessageDialog("appWillBeClosed", "Hello World", Messages.getInformationIcon());
    }
}
