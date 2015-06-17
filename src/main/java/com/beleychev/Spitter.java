package com.beleychev;

/**
 * Created by ilya on 17.06.15.
 */
import java.util.List;

public class Spitter {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private List<Spittle> spittles;
    private String email;
    private boolean updateByEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSpittles(List<Spittle> spittles) {
        this.spittles = spittles;
    }

    public List<Spittle> getSpittles() {
        return spittles;
    }

    public void setUpdateByEmail(boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }


    @Override
    public boolean equals(Object obj) {
        Spitter other = (Spitter) obj;
        return other.fullName.equals(fullName) && other.username.equals(username) && other.password.equals(password);
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", spittles=" + spittles +
                ", email='" + email + '\'' +
                ", updateByEmail=" + updateByEmail +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + fullName.hashCode();
        result = 31 * result + (spittles != null ? spittles.hashCode() : 0);
        result = 31 * result + email.hashCode();
        result = 31 * result + (updateByEmail ? 1 : 0);
        return result;
    }
}
