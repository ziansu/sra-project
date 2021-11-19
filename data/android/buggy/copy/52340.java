private void id() {
    Token current = tokenList.get(0);
    if ((current.value()) == (TokId.TIDNT)) {
        tokenList.remove(0);
    }
}