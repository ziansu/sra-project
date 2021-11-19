public void removeReserves(risk.BoardUtils.Colors player, int num) {
    int changeTo = (reserves.get(player)) - num;
    if (changeTo > 0) {
        return ;
    }
    setPlayerReserves(player, changeTo);
}