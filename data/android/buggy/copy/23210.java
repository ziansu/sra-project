@java.lang.Override
public void execute(org.bukkit.entity.Player player) {
    newDialog.onTrigger(null, player);
    script.getDialog().getHandler().getManager().getPlugin().pm.getData(player).startDialog(newDialog);
}