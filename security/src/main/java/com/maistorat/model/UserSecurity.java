package com.maistorat.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Petio on 26.2.2018 г..
 */
public class UserSecurity implements UserDetails {
    private Long id;
    private final String username;
    private final String password;
    private final String email;

    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;

    private final Set<Role> authorities;


    public UserSecurity(Long id, String username, String password, String email,
                        boolean isAccountNonExpired, boolean isAccountNonLocked, boolean isCredentialsNonExpired,
                        boolean isEnabled, Set<Role> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
        this.authorities = authorities;
    }



    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<Permission> permissions = new HashSet<Permission>();

        return permissions;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


}
