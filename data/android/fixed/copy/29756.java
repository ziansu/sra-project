private boolean isValidChar(byte i_Char) {
    boolean b = ((i_Char > 64) && (i_Char < 91)) || ((i_Char > 96) && (i_Char < 123));
    return b;
}