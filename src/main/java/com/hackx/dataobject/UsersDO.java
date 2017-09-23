package com.hackx.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 曹磊(Hackx) on 22/9/2017.
 * Email: caolei@mobike.com
 */
@Data
@Entity
@Table(name = "users")
public class UsersDO implements Serializable {
    private static final long serialVersionUID = -6158598424117746351L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, name = "gmt_create")
    private Date gmtCreate;
    @Column(nullable = false, name = "gmt_modified")
    private Date gmtModified;
    @Column(nullable = false, name = "name")
    private String name;
    @Column(nullable = false, name = "age")
    private Integer age;
    @Column(nullable = false, name = "email")
    private String email;
    @Column(nullable = false, name = "remark")
    private String remark;
}
