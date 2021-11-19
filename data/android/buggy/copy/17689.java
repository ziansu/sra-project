private void onDesiredPosts(java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> desired_maps, java.util.HashMap<java.lang.String, java.lang.String> userInfo) {
    final java.lang.String user_nickname = userInfo.get("USER_NICKNAME");
    populate_feed(desired_maps);
}