package com.csc.elasticsearch.service;

import com.csc.elasticsearch.pojo.User;
import com.csc.elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/27 0:20
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Iterable<User> findAll() {
        return null;
    }

//    public Iterable<User> findAll() {
//        return userRepository.findAll();
//    }
}
