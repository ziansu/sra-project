@java.lang.Override
public void setGame(net.dv8tion.jda.core.entities.Game game) {
    setPresence(status, game, idle);
}