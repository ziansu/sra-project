public void actionPerformed(java.awt.event.ActionEvent e) {
    jdbcTw.updateResult(tweetList.get(currentPostId).getTweetid(), 2);
    actualizeText();
}