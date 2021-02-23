package com.actor3.actor3.service;

import com.actor3.actor3.entity.ClientUser;
import com.actor3.actor3.entity.Role;
import com.actor3.actor3.entity.User;
import com.actor3.actor3.repository.RoleRepository;
import com.actor3.actor3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class UserService implements UserDetailsService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    public boolean registerNewUser(User user) {
        UserDetails existUser = loadUserByUsername(user.getUsername());
        if (existUser == null) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

            ClientUser clientUser = new ClientUser();
            clientUser.setUser(user);
            user.setClientUser(clientUser);

            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }
}
