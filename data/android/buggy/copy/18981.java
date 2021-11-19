public void woundTeammates() {
    com.badlogic.gdx.utils.Array<com.esbjon.inventories.Teammate> teammates = inventory.getTeammates();
    for (int i = 0; i < (teammates.size); i++)
        teammates.get(i).wound();
    
}