private char requireEscapableChar() {
    char c = next();
    if (!(com.jeremydeanlakey.json.Jparser.escapableChars.contains(c)))
        makeException("escapable char", c);
    
    return c;
}