@java.lang.Override
public void postDetach() {
    if (com.massivecraft.factions.integration.Econ.shouldBeUsed()) {
        com.massivecraft.factions.integration.Econ.setBalance(getAccountId(), 0);
    }
    this.getAccountId();
    com.massivecraft.factions.Board.clean();
    FPlayers.i.clean();
}