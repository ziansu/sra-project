@java.lang.SuppressWarnings(value = "deprecation")
public void attack() {
    org.rev317.min.api.wrappers.Npc[] n = org.rev317.min.api.methods.Npcs.getNearest(npcFilter);
    if ((n.length) == 0) {
        java.lang.System.out.print("No npc to attack");
        return ;
    }
    n[0].interact(1);
}