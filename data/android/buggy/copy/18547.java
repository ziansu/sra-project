@java.lang.Override
public int getPlayerResult(java.lang.String player) throws java.lang.IllegalStateException {
    super.getPlayerResult(player);
    if ((matchStatus) != (MATCH_FINISHED)) {
        throw new java.lang.IllegalStateException("Illegal match state");
    }
    return playerResults.get(player);
}