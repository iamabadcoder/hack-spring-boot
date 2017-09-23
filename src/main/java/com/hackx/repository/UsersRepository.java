package com.hackx.repository;

import com.hackx.dataobject.UsersDO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 曹磊(Hackx) on 22/9/2017.
 * Email: caolei@mobike.com
 */
public interface UsersRepository extends JpaRepository<UsersDO, Long> {

    UsersDO findById(Long id);

    UsersDO findByEmail(String email);

    UsersDO findByNameAndEmail(String name, String email);

    List<UsersDO> findByName(String name, Pageable pageable);
}
