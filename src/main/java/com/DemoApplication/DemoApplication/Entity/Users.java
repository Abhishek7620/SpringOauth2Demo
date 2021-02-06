package com.DemoApplication.DemoApplication.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    @ManyToMany
    @JoinTable (name="user_shares",
            joinColumns = { @JoinColumn (name = "user_id",referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name="share_id",referencedColumnName="ID")}
    )
    private Set<ShareDtl> shareDtls;
    private String userCode;

    public Set<ShareDtl> getShareDtls() {
        return shareDtls;
    }

    public void setShareDtls(Set<ShareDtl> shareDtls) {
        this.shareDtls = shareDtls;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
