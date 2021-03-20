package ru.netology.domain;

public class RepostsInfo {
    private int countReposts;
    private boolean canRepost;
    private int usersWhoRepostedIds;
    private boolean currentUserReposted;

    public int getCountReposts() {
        return countReposts;
    }

    public void setCountReposts(int countReposts) {
        this.countReposts = countReposts;
    }

    public boolean isCanPushTheRepostButton() {
        return canRepost;
    }

    public void setCanPushTheRepostButton(boolean canPushTheRepostButton) {
        this.canRepost = canPushTheRepostButton;
    }

    public int getUsersWhoRepostedIds() {
        return usersWhoRepostedIds;
    }

    public void setUsersWhoRepostedIds(int usersWhoRepostedIds) {
        this.usersWhoRepostedIds = usersWhoRepostedIds;
    }
}
