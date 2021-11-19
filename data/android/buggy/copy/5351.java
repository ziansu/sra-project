public static void updateLastSeen() {
    enviromine.client.gui.UpdateNotification.lastSeen = WordPressPost.Posts.get(0).getPubDate();
}