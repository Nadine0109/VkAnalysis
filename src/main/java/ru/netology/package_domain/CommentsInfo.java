package ru.netology.package_domain;

public class CommentsInfo {
    private long userId;
    private int count;
    private String theCommentText;
    private String answers;
    private String dateAndTimeOfTheComment;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTheCommentText() {
        return theCommentText;
    }

    public void setTheCommentText(String theCommentText) {
        this.theCommentText = theCommentText;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getDateAndTimeOfTheComment() {
        return dateAndTimeOfTheComment;
    }

    public void setDateAndTimeOfTheComment(String dateAndTimeOfTheComment) {
        this.dateAndTimeOfTheComment = dateAndTimeOfTheComment;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
