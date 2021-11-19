@java.lang.Override
public void clear() {
    if ((super.size()) > 0) {
        sharedObject.setChildModified(true);
    }
    super.clear();
}