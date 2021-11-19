@java.lang.Override
public int compare(com.time_em.model.TaskEntry v1, com.time_em.model.TaskEntry v2) {
    return v1.getSignedOutHours().compareTo(v2.getSignedOutHours());
}