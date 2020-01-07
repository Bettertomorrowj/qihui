package com.qihui.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "company_user")
public class CompanyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String mobile;

    private String username;

    private String password;

    private String salt;

    private String nickname;

    private Byte sex;

    private String avatar;

    private String token;

    private Byte loginError;

    private Long unlockTime;

    private Byte status;

    private String remarks;

    private Integer loginNum;

    private Long createAt;

    private Long updateAt;

    private Long lastloginAt;

    private Byte isDeleted;
}
