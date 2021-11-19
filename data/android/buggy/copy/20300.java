@java.lang.Override
public void post(java.lang.String line) {
    ircService.addPostToHistory(line);
    send(line);
}