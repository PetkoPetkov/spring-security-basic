package com.maistorat.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Petio on 1.3.2018 г..
 */
public class Permission implements GrantedAuthority {
    private Long id;
    private final String description;
    private String authority;

    public Permission(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
