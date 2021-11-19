public boolean isContainsOwnerPostsOnly() {
    for (org.jtalks.jcommune.model.entity.Post post : getDisplayedPosts()) {
        if (post.getUserCreated().equals(topicStarter)) {
            return false;
        }
    }
    return true;
}