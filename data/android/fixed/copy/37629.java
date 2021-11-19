public void clearReplies() {
    for (int i = 0; i < (replies.length); i++) {
        java.util.Arrays.fill(replies[i], ((short) (0)));
    }
}