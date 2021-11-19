protected void discardLine() throws java.io.IOException {
    while (((st.nextToken()) != (java.io.StreamTokenizer.TT_EOF)) && ((st.ttype) != (java.io.StreamTokenizer.TT_EOL)));
}