public Command GetCommand(java.lang.String name) {
    for (Command c : mCommands) {
        if (c.GetName().toLowerCase().equals(name.toLowerCase())) {
            return c;
        }
    }
    return null;
}