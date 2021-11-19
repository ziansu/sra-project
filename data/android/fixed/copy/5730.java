public static void initialize() {
    theweekend.npc.NPC npc = new theweekend.npc.NPC(org.bukkit.entity.EntityType.VILLAGER, theweekend.npc.RewardNPC.npcLoc, "deliveryman", true);
    npc.setProfession(Profession.PRIEST);
}