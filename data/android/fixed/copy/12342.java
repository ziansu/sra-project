@java.lang.Override
public void run() {
    if (avatar.getInventory().contains(self)) {
        avatar.equipItem(self);
        avatar.getInventory().remove(self);
    }
}