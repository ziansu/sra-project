@java.lang.Override
public server.commands.games.ICommand BuildCommand() {
    return new server.commands.games.GamesJoinCommand(cookie, gameID, color);
}