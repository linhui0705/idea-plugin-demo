package net.coderlin.plugin.demo.service;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.ServiceManager;

public interface ApplicationService {
    static ApplicationService getInstance() {
        return ServiceManager.getService(ApplicationService.class);
    }
}
