private void undoEditEndTime(int index, java.time.LocalDateTime endTime) {
    logic.Undo u = new logic.Undo();
    u.setCommand("editEndTime");
    u.setIndex(index);
    u.setEndTime(endTime);
    UndoList.push(u);
}