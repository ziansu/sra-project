private void parseBlockComment() {
    while (((token.kind) != (TokenKind.BLOCK_COMMENT_CLOSE)) && ((token.kind) != (TokenKind.EOT))) {
        token = scanner.scan();
    } 
    java.lang.System.out.println(token.kind);
    accept(TokenKind.BLOCK_COMMENT_CLOSE);
}