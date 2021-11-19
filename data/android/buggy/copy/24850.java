private void renderConsoleOutput(java.lang.String text, java.lang.String clazz, boolean isError) {
    initializeOutput(RmdChunkOutputUnit.TYPE_TEXT);
    vconsole_.submit(text, clazz, isError);
    onHeightChanged();
}