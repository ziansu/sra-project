private void updateMonster(model.Monster m) {
    if (m.isDead()) {
        removeSprite(m.getSpriteBase());
        removeSprite(m.getPrisonBubble().getSpriteBase());
    }
    update(m.getSpriteBase());
}