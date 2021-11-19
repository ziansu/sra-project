private java.lang.String oldNick(de.btobastian.javacord.entities.User u, java.lang.String name, java.lang.String uID) {
    return name == null ? u.getName() : name;
}