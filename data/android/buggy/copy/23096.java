@java.lang.Override
public void reopenTask(java.lang.Long id) throws java.lang.Exception {
    if (id != null) {
        com.taskmaster.dao.entity.Task t = tdao.findOne(id);
        t.setCompleteDate(null);
        tdao.save(t);
    }
}