package com.zurnachyan.gadrat.entity.user;

import com.zurnachyan.gadrat.entity.view.UserImage;
import com.zurnachyan.gadrat.enums.UserRole;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * User account
 */
@Data
//@Entity
public class User /*implements UserDetails*/ {
//
//    /**
//     * User`s id
//     */
//    @Id
//    @Column(name = "c_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    /**
//     * User`s username
//     */
//    @Column(name = "c_username")
//    private String username;
//
//    /**
//     * User`s email
//     */
//    @Column(name = "c_email")
//    private String email;
//
//    /**
//     * User`s password
//     */
//    @Column(name = "c_password")
//    private String password;
//
//    /**
//     * User`s first name
//     */
//    @Column(name = "c_first_name")
//    private String firstName;
//
//    /**
//     * User`s last name
//     */
//    @Column(name = "c_last_name")
//    private String lastName;
//
//    /**
//     * Is user`s account active
//     */
//    @Column(name = "c_active")
//    private boolean active;
//
//    /**
//     * Is user`s account blocked
//     */
//    @Column(name = "c_blocked")
//    private boolean blocked;
//
//    /**
//     * Avatar image of account
//     */
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_image_id")
//    private UserImage avatar;
//
//    /**
//     * Collection of roles that give rights to user
//     */
//    @Enumerated(EnumType.STRING)
//    @ElementCollection(targetClass = UserRole.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "t_user_roles", joinColumns = @JoinColumn(name = "fk_user_id"))
//    @Column(name = "c_role")
//    private Set<UserRole> roles;
//
//    /**
//     * Get collection of user roles
//     * @return roles collection
//     */
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roles;
//    }
//
//    /**
//     * Account is not expired
//     * @return true/false
//     */
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    /**
//     * Account is not blocked
//     * @return true/false
//     */
//    @Override
//    public boolean isAccountNonLocked() {
//        return !blocked;
//    }
//
//    /**
//     * Account credentials not expired (always true because accounts cannot expire in this system)
//     * @return true
//     */
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    /**
//     * Is account enabled (active)
//     * @return true/false
//     */
//    @Override
//    public boolean isEnabled() {
//        return active;
//    }
}
