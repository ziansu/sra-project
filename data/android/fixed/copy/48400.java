public java.lang.Character getCharacter(java.lang.String name) {
    java.lang.Character instance = findCharacter(name);
    if (instance != null)
        return instance;
    
    throw new java.lang.IllegalArgumentException((("Character '" + name) + "' was not found"));
}