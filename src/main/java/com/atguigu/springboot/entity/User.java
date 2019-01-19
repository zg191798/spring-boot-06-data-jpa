package com.atguigu.springboot.entity;

import javax.persistence.*;

/**
 * @author zhangge
 * @date 2019/1/19 - 9:50
 */
// 使用JPA注解配置映射关系
@Entity
@Table(name="tbl_user")
public class User {

    @Id // 这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增主键
    private  Integer id;
    // 这是和数据表对应的一个列
    @Column(name="last_name",length = 50)
    private String lastName;
    // 省略默认对列名就是属性名
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
