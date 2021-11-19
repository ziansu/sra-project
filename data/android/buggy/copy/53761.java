public boolean commandExist(java.lang.String command) {
    ru.sincore.cmd.CmdContainer cmdContainer = ru.sincore.cmd.CmdContainer.getInstance();
    if (cmdContainer.getConteiner().containsKey(command)) {
        return true;
    }
    return false;
}