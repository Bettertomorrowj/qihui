package com.qihui.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "company_member_auth")
public class CompanyMemberAuth {
    private Integer id;

    private Integer mid;

    private String username;

    private String password;

    private String salt;

    private String wxOpenid;

    private String wxUnionid;

    private Byte status;
}