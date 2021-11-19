public void enviromentLogic() {
    for (int i = 0; i < (PlayerList.size()); i++) {
        CentralizedDataCenter.Entities.Player player = PlayerList.get((i + 1));
        player.decreaseOrganHp(2);
    }
}