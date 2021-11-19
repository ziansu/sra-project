public void responseFromUser(java.lang.String username, boolean accept) {
    if (accept) {
        inGame = true;
        initGamePage();
    }else {
        feedBackLabel.setText((username + " declined your invitation"));
    }
}