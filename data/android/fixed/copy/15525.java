public void updateMasterBlock() {
    T master = master();
    if (master != null) {
        master.markDirty();
    }
}