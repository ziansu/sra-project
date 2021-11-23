public void releasedAt(java.awt.event.MouseEvent release) {
    java.lang.System.out.println("Release");
    checkIfQuickClick(release);
    if (((draggedStack) != null) && ((draggedStack.size()) > 0)) {
        dragReleaseActions(release);
    }
}