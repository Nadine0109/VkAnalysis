package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdById;
    private String ownerLogoImageUrl;
    private String dateAndTimeOfThePost;
    private String imageOrVideoUrl;
    private String theText;
    private String outsideSourceUrl;
    private int replyPostId;
    private boolean friendsOnly;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private PostViewersInfo postViewersInfo;
    private CommentsInfo commentsinfo;
    private boolean canHideTheText;
    private String postType;
    private GeoInfo geoInfo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean pinned;
    private boolean markedAsAds;
    private boolean favourite;
    private int postponedId;
    private String query;

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Post() {
    }

    public int getPostId() {
        return postId;
    }

    public void setId(int id) {
        this.postId = id;
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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

}
