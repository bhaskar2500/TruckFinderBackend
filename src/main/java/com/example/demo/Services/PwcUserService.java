package com.example.demo.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class PwcUserService implements UserDetailsService   {
    
    @Override   
public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        return new User("fo","fo",new ArrayList<>());
        
    }
}
