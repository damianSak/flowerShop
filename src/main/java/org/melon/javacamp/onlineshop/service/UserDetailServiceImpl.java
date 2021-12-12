package org.melon.javacamp.onlineshop.service;

import org.melon.javacamp.onlineshop.dao.AccountDAO;
import org.melon.javacamp.onlineshop.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;


public class UserDetailServiceImpl {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountDAO.findAccount(username);
        System.out.println("Account= " + account);
        if (account == null) {
            throw new UsernameNotFoundException("User" + username + "was not found in the database");
        }

        String role = account.getUserRole();

        List<GrantedAuthority> grantList = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role);
        grantList.add(grantedAuthority);

        boolean isEnabled = account.isActive();
        boolean isAccountNotExpired = true;
        boolean isCredentialsNotExpired = true;
        boolean isAccountNotLocked = true;

        UserDetails userDetails = (UserDetails) new User(account.getUserName(),
                account.getEncryptedPassword(), enabled, isAccountNotExpired, isCredentialsNotExpired,
                isAccountNotLocked, grantList);

        return userDetails;
    }
}
