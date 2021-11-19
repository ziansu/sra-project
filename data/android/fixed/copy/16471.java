public static com.infiniteloop.mytasks.TaskLab get(android.content.Context c) {
    if ((com.infiniteloop.mytasks.TaskLab.sTaskLab) == null) {
        com.infiniteloop.mytasks.TaskLab.sTaskLab = new com.infiniteloop.mytasks.TaskLab(c);
    }
    return com.infiniteloop.mytasks.TaskLab.sTaskLab;
}