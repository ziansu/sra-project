private void parseCommand() {
    java.lang.String command = wordsList.get(0).toString();
    if (command.toLowerCase().equals("play"))
        playCommand();
    
}