@java.lang.Override
public void sendMessage(org.bukkit.entity.Player player, net.md_5.bungee.api.chat.BaseComponent component) {
    player.sendMessage(component.toPlainText());
}