@java.lang.Override
public boolean isPlayerExist(com.millhouse.chessrating.model.Player player) {
    return (findByName(player.getName())) != null;
}