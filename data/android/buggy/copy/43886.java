public boolean isSubSubCommand(java.lang.String subSubCommand) {
    if ((!(hasSubSubCommand())) || (subSubCommand == null))
        return false;
    
    return subSubCommand.equalsIgnoreCase(this.subSubCommand);
}