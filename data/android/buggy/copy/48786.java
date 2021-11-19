private void moveCursor(int count) throws com.github.fastxml.exception.ParseException {
    cursor += count;
    read(cursor);
}