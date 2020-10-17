package net.coderlin.plugin.demo.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.Messages;

public class FirstPluginAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // Notification
        NotificationGroup notificationGroup =
                new NotificationGroup("firstplugin_id", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification("点击测试", MessageType.INFO);
        Notifications.Bus.notify(notification);

        // Message
        Messages.showMessageDialog("First Plugin", "First Plugin Action", Messages.getInformationIcon());
    }
}
