@java.lang.Override
public boolean keyTyped(char character) {
    if (readInput) {
        input += character;
        addChar(character);
    }
    return false;
}