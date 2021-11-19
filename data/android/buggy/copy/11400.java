public solitaire.Card putCard() {
    if (!(stack.isEmpty())) {
        frameOff();
    }
    return stack.pop();
}