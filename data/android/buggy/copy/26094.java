public void setWord(int startIndex, int length) {
    replace(startIndex, length, "", ProcessedString.TokenType.Word);
}