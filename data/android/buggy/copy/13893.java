protected java.lang.Character findCharacter(java.lang.String name) {
    java.lang.Character character = characters.get(name);
    if (character != null)
        return character;
    
    return null;
}