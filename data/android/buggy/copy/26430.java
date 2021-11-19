public void moveObjectFromTo(com.mygdx.game.gameplay.models.Position oldPosition, com.mygdx.game.gameplay.models.Position newPosition, com.mygdx.game.gameplay.models.field.FieldType type) {
    level.set(oldPosition, FieldType.NULL);
    actionList.add(new com.mygdx.game.gameplay.action.Action(oldPosition, newPosition, type, actionCallbackFinish));
}