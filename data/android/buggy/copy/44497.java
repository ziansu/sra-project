public boolean hasReadyRemove() {
    if ((getStatusEnum()) == (com.lguipeng.notes.model.SNote.Status.NEED_REMOVE)) {
        return true;
    }
    return false;
}