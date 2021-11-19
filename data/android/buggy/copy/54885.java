@java.lang.Override
public void onOpenClient() {
    if (wildlings) {
        got.wildlings.Wildlings.instance().nextLevel();
    }
}