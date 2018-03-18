package com.maistorat.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

/**
 * Created by Petio on 1.3.2018 г..
 */
public class Role  {
    private String authority;
    private final Set<Permission> permissions;

    public Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }


}
