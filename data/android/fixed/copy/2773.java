@java.lang.Override
public void onAbort(co.aikar.taskchain.TaskChain<?> chain, org.bukkit.entity.Player player, java.lang.String message) {
    player.sendMessage(message);
}