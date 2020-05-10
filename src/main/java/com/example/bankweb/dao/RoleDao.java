package com.example.bankweb.dao;

import com.example.bankweb.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findName(String name);
}
