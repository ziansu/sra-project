@java.lang.Override
public void run() {
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        com.projectkorra.ProjectKorra.chiblocking.ChiPassive.handlePassive();
        com.projectkorra.ProjectKorra.chiblocking.Smokescreen.removeFromHashMap(player);
        com.projectkorra.ProjectKorra.chiblocking.WarriorStance.progressAll();
        com.projectkorra.ProjectKorra.chiblocking.AcrobatStance.progressAll();
    }
}