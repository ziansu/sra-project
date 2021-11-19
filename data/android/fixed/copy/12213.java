public void actionPerformed(java.awt.event.ActionEvent e) {
    if (game.getState().executeAction(StatePlay.ACTION_EXECUTEPLAYACTION, new java.lang.Object[]{ bwyap.familyfeud.game.play.state.StateFamilyPlay.ACTION_STRIKE }))
        bwyap.familyfeud.sound.SoundManager.getInstance().playClip("strike");
    
}