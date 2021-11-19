private static void showToUser(java.lang.String text) {
    if (text.isEmpty()) {
        return ;
    }
    Task.Controller.getInstance().printToScreen(text);
}