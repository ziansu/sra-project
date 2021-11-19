public void addNewPending(java.util.ArrayList<java.lang.String> newPending) {
    for (java.lang.String pending : newPending) {
        this.mPending.put(pending, pending);
    }
}