public static void updateLastSeen() {
    if ((WordPressPost.Posts.size()) > 0) {
        enviromine.client.gui.UpdateNotification.lastSeen = WordPressPost.Posts.get(0).getPubDate();
    }
}