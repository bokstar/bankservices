package com.example.bankweb.service.serivceImp;

import com.example.bankweb.domain.User;
import com.example.bankweb.domain.security.UserRole;
import com.example.bankweb.service.UserService;

import java.util.List;
import java.util.Set;

public class UserServiceImp implements UserService {

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        return false;
    }

    @Override
    public boolean checkUsernameExists(String username) {
        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        return false;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> findUserList() {
        return null;
    }

    @Override
    public void enableUser(String username) {

    }

    @Override
    public void disableUser(String username) {

    }
}
