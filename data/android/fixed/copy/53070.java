public static void sendPrivate(net.dv8tion.jda.core.entities.User u, net.dv8tion.jda.core.entities.Message message) {
    if (u == null) {
        throw new java.lang.NullPointerException();
    }
    com.tazzie02.tazbotdiscordlib.SendMessage.sendPrivate(u.getPrivateChannel(), message);
}