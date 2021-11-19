@java.lang.Override
public void clear() {
    if ((super.size()) > 0) {
        this.setModified(true);
        sharedObject.setChildModified(true);
    }
    super.clear();
}