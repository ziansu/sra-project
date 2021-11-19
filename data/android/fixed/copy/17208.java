public void onStderr(java.lang.String message) {
    if (message.isEmpty()) {
        return ;
    }
    java.lang.System.err.println(message);
}