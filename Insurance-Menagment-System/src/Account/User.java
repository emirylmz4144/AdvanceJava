package Account;

import Address.Address;

import java.util.ArrayList;
import java.util.Date;

public class User
{
    private String name;
    private String surName;
    private String eMail;
    private String password;
    ArrayList<Address> ourAddresses;

    Date lastLogin;

    public User(String name, String surName, String eMail, String password) {
        this.name = name;
        this.surName = surName;
        this.eMail = eMail;
        this.password = password;
        ourAddresses =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Address> getOurAddresses() {
        return ourAddresses;
    }

    public void setOurAddresses(ArrayList<Address> ourAddresses) {
        this.ourAddresses = ourAddresses;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
