public java.util.List<java.lang.String> getLogEntries(int offset, int lines) {
    final com.github.theholywaffle.teamspeak3.CLogView logs = new com.github.theholywaffle.teamspeak3.CLogView(lines, offset);
    if (query.doCommand(logs)) {
        return logs.getLines();
    }
    return null;
}