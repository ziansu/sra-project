public java.lang.Character getCharacter(java.lang.String name) {
    for (java.lang.Character aChar : charList) {
        if (aChar.getName().equalsIgnoreCase(name))
            return aChar;
        
    }
    return null;
}