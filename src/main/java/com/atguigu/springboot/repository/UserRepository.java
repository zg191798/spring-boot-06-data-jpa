package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangge
 * @date 2019/1/19 - 9:56
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
