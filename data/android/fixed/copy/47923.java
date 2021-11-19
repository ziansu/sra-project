public java.util.List<java.lang.String> getLogEntries(int lines) {
    final com.github.theholywaffle.teamspeak3.CLogView logs = new com.github.theholywaffle.teamspeak3.CLogView(lines, false);
    if (query.doCommand(logs)) {
        return logs.getLines();
    }
    return null;
}