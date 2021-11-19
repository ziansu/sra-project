@java.lang.Override
public void showConsoleText(java.lang.String text) {
    flushQueuedErrors();
    renderConsoleOutput(text, classOfOutput(ChunkConsolePage.CONSOLE_OUTPUT), false);
}