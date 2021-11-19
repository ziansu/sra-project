public void buttonAuth(java.lang.String username, java.lang.String password) {
    ((com.example.brewchat.Application) (getApplication())).getChatService().login(username, password);
}