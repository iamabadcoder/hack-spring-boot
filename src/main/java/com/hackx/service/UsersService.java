package com.hackx.service;

import com.hackx.dataobject.UsersDO;

/**
 * Created by 曹磊(Hackx) on 22/9/2017.
 * Email: caolei@mobike.com
 */
public interface UsersService {

    UsersDO findById(Long id);

}
