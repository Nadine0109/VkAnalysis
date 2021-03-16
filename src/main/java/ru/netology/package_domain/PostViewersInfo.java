package ru.netology.package_domain;

public class PostViewersInfo {
    private int usersWhoViewedIds;
    private int countUsers;

    public int getCountUsers() {
        return countUsers;
    }

    public void setCountUsers(int countUsers) {
        this.countUsers = countUsers;
    }

    public int getUsersWhoViewedIds() {
        return usersWhoViewedIds;
    }

    public void setUsersWhoViewedIds(int usersWhoViewedIds) {
        this.usersWhoViewedIds = usersWhoViewedIds;
    }

}
