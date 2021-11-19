public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String location = BattleshipsGamePanel.controlLocationLabel.getText();
    if (isMyTurn) {
        sendShot(location);
        battleshipsCommandObject.sendCommand("shot");
    }else {
        battleLog.append("It is not your turn!\n");
    }
}