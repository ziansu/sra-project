public static int getNpcIndexId(int npc) {
    for (int i = 0; i < 6800; i++) {
        if ((application.util.NpcList.npcId[i]) == npc) {
            return i;
        }
    }
    return -1;
}