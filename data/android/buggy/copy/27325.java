@java.lang.Override
public void onSlotChanged() {
    com.auramcraft.util.LogHelper.info(("Output changed: " + ((getStack()) == null ? "null" : getStack().getDisplayName())));
    super.onSlotChanged();
}