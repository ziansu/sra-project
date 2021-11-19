public void connectToUser() {
    keyServerSetup();
    java.lang.String command = commandStringGenerator(pathToResourceDocker, "port_connect.sh", getVncPort(), getKey(), getSupporterSettings());
    systemCommander.executeTerminalCommand(command);
    startVncViewer("localhost");
}