public void createNewGameWindow() {
    if ((addPlayersFrame) != null)
        addPlayersFrame.dispose();
    
    addPlayersFrame = new front.AddPlayersFrame();
    panel.add(addPlayersFrame);
    addPlayersFrame.setVisible(true);
}