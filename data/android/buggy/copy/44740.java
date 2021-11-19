@java.lang.Override
public void setStatus(net.dv8tion.jda.core.OnlineStatus status) {
    setPresence(status, game, idle);
}