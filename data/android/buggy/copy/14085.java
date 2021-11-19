@java.lang.Override
public void onClear() {
    super.onClear();
    if ((currentboom) != null) {
        currentboom.remove();
    }
}