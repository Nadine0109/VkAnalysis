package ru.netology.domain;

public class LikesInfo {
    private int countLikes;
    private int usersWhoLikedIds;
    private boolean canLike;
    private boolean currentUserLikes;

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
        return canLike;
    }

    public void setCanPushTheLikeButton(boolean canPushTheLikeButton) {
        this.canLike = canPushTheLikeButton;
    }
}
