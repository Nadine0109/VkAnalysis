package ru.netology.package_domain;

public class LikesInfo {
    private int countLikes;
    private int usersWhoLikedIds;
    private boolean canPushTheLikeButton;

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int getUsersWhoLikedIds() {
        return usersWhoLikedIds;
    }

    public void setUsersWhoLikedIds(int usersWhoLikedIds) {
        this.usersWhoLikedIds = usersWhoLikedIds;
    }

    public boolean isCanPushTheLikeButton() {
        return canPushTheLikeButton;
    }

    public void setCanPushTheLikeButton(boolean canPushTheLikeButton) {
        this.canPushTheLikeButton = canPushTheLikeButton;
    }
}
