package ru.netology.package_domain;

public class Post {
    private int id;
    private int ownerId;
    private String ownerLogoImageUrl;
    private String postName;
    private String dateAndTimeOfThePost;
    private String imageOrVideoUrl;
    private String theText;
    private String outsideSourceUrl;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private PostViewersInfo postViewersInfo;
    private CommentsInfo commentsinfo;
    private boolean canHideTheText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerLogoImageUrl() {
        return ownerLogoImageUrl;
    }

    public void setOwnerLogoImageUrl(String ownerLogoImageUrl) {
        this.ownerLogoImageUrl = ownerLogoImageUrl;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDateAndTimeOfThePost() {
        return dateAndTimeOfThePost;
    }

    public void setDateAndTimeOfThePost(String dateAndTimeOfThePost) {
        this.dateAndTimeOfThePost = dateAndTimeOfThePost;
    }

    public String getImageOrVideoUrl() {
        return imageOrVideoUrl;
    }

    public void setImageOrVideoUrl(String imageOrVideoUrl) {
        this.imageOrVideoUrl = imageOrVideoUrl;
    }

    public String getTheText() {
        return theText;
    }

    public void setTheText(String theText) {
        this.theText = theText;
    }

    public String getOutsideSourceUrl() {
        return outsideSourceUrl;
    }

    public void setOutsideSourceUrl(String outsideSourceUrl) {
        this.outsideSourceUrl = outsideSourceUrl;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public PostViewersInfo getPostViewersInfo() {
        return postViewersInfo;
    }

    public void setPostViewersInfo(PostViewersInfo postViewersInfo) {
        this.postViewersInfo = postViewersInfo;
    }


    public CommentsInfo getCommentsinfo() {
        return commentsinfo;
    }

    public void setCommentsinfo(CommentsInfo commentsinfo) {
        this.commentsinfo = commentsinfo;
    }

    public boolean isCanHideTheText() {
        return canHideTheText;
    }

    public void setCanHideTheText(boolean canHideTheText) {
        this.canHideTheText = canHideTheText;
    }
}
