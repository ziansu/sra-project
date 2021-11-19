public final void writeValuesToRow() {
    writeRow(java.util.Arrays.copyOf(partialLine, partialLineIndex));
    partialLineIndex = 0;
}