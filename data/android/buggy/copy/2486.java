protected void headerName(int tok) throws java.text.ParseException {
    this.lexer.match(tok);
    this.lexer.SPorHT();
    this.lexer.match(':');
    this.lexer.SPorHT();
}