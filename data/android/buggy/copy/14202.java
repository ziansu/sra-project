public static void requestUserInfo(java.lang.String username) throws java.io.IOException {
    test.client.requestUserInfo(username);
    test.client.downloadFile((username + ".jpg"));
}