package org.fireply.enter.model;
// Generated 2016-5-23 16:15:06 by Hibernate Tools 4.3.1.Final

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

    private String id;
    private User user;

    public Admin() {
    }

    public Admin(String id, User user) {
        this.id = id;
        this.user = user;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}