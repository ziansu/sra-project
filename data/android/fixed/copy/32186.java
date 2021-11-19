public boolean isNameOrAlias(java.lang.String input) {
    if ((input.equals(name)) || (isAlias(input)))
        return true;
    else
        return false;
    
}