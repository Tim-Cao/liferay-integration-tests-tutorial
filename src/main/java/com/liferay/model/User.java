package com.liferay.model;

public class User {
    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        setPassword(password);
    }

    public void addUserGroupUser(long groupId) {
        this.groupId = groupId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        if (password.length() < 4) {
            throw new IllegalArgumentException("The length of password must be longer than 4 chars");
        }

        this.password = password;
    }

    private String emailAddress;

    private long groupId;

    private String password;

}