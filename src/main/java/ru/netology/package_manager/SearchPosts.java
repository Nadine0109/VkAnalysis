package ru.netology.package_manager;

import ru.netology.package_domain.Post;

public class SearchPosts {
    private PostManager postManager;
    /**
     * Search Posts
     */
    public Post [] search ()
    { Post[] items = postManager.getPostsForFeed();

        for (Post post : items) {
            String block = post.getQuery();
        }
        return null;
    }
}
