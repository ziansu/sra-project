@java.lang.Override
public boolean onItemMove(int fromPosition, int toPosition) {
    org.puder.trs80.Configuration.move((fromPosition - 1), (fromPosition - 1));
    notifyItemMoved(fromPosition, toPosition);
    return true;
}