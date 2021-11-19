private boolean isNewLine(int ch) {
    if (ch == (org.neo4j.csv.reader.BufferedCharSeeker.EOL_CHAR)) {
        (lineNumber)++;
        return true;
    }
    return ch == (org.neo4j.csv.reader.BufferedCharSeeker.EOL_CHAR_2);
}