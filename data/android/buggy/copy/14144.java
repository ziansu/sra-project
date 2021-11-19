public boolean sm() {
    match();
    if (currentToken.getName().equals("WS")) {
        match();
    }
    return currentToken.getName().equals("SM");
}