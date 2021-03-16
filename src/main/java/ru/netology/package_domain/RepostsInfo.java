package ru.netology.package_domain;

public class RepostsInfo {
    private int countReposts;
    private boolean canPushTheRepostButton;
    private int usersWhoRepostedIds;

    public int getCountReposts() {
        return countReposts;
    }

    public void setCountReposts(int countReposts) {
        this.countReposts = countReposts;
    }

    public boolean isCanPushTheRepostButton() {
        return canPushTheRepostButton;
    }

    public void setCanPushTheRepostButton(boolean canPushTheRepostButton) {
        this.canPushTheRepostButton = canPushTheRepostButton;
    }

    public int getUsersWhoRepostedIds() {
        return usersWhoRepostedIds;
    }

    public void setUsersWhoRepostedIds(int usersWhoRepostedIds) {
        this.usersWhoRepostedIds = usersWhoRepostedIds;
    }
}
