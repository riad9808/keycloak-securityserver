package com.bayat.keycloaksecurityserver;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "baeldung-realm.json";
    AdminUser adminUser = new AdminUser();

    // getters and setters

    public static class AdminUser {
        String username = "admin";
        String password = "admin";

        // getters and setters        
    }
}