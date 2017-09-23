package com.hackx.service.impl;

import com.hackx.dataobject.UsersDO;
import com.hackx.repository.UsersRepository;
import com.hackx.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 曹磊(Hackx) on 22/9/2017.
 * Email: caolei@mobike.com
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersRepository usersRepository;

    @Override
    public UsersDO findById(Long id) {
        return usersRepository.findById(id);
    }
}
