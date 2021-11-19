@java.lang.Override
public int compare(com.tasking.Task lhs, com.tasking.Task rhs) {
    return statusMap.get(lhs.getStatus()).compareTo(statusMap.get(rhs.getStatus()));
}