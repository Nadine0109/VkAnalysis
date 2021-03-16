package ru.netology.package_manager;

import ru.netology.package_domain.Post;

public class DeletePost {
    private PostManager postManager;
    /**
     * Delete Post
     */
    public void delete () {
        Post[] posts = postManager.getPostsForFeed();

        for (Post post : posts) {
            int postToDelete = post.getPostId();
        }
    }
}
