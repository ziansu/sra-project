public final void stop() {
    if ((com.heliosphere.athena.base.terminal.AbstractTerminal.status) == (TerminalStatusType.RUNNING)) {
        com.heliosphere.athena.base.terminal.AbstractTerminal.status = TerminalStatusType.STOPPED;
    }
}