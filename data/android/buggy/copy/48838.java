public void mouseClicked(java.awt.event.MouseEvent e) {
    ascendButton.setVisible(true);
    descendButton.setVisible(false);
    isUp = false;
    nbaquery.presentation2.card.CardProperties.set_team_isUp(isUp);
}