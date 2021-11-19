public void setStat(au.com.mineauz.peculiaritems.peculiarstats.PeculiarStat stat, int value) {
    if (!(stats.containsKey(stat))) {
        return ;
    }
    stats.put(stat, value);
    checkAndUpdateName();
    saveStats();
    update();
}