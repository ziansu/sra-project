public boolean isCharacterGroupCreator() {
    return com.universeprojects.miniup.server.GameUtils.equals(this.character.getKey(), this.characterGroup.getProperty("creatorKey"));
}