package com.DemoApplication.DemoApplication.Entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="SHARE_DETAILS")
public class ShareDtl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;
    private String shareName;
    private long quantity;
    private long price;

    @ManyToMany(mappedBy = "shareDtls")
    private Set<Users> users ;


    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
