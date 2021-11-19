public boolean commandExist(java.lang.String command) {
    ru.sincore.cmd.CmdContainer cmdContainer = ru.sincore.cmd.CmdContainer.getInstance();
    return cmdContainer.getConteiner().containsKey(command);
}