public void startInteraction(com.noname.mrch.gameobject.GameCharacter character) {
    interactionBox.setInteractingCharacter(character);
    interactionBox.setVisible(true);
    lowerGuiGroup.setTouchable(Touchable.disabled);
}