@java.lang.Override
public java.lang.Boolean remove(java.lang.Integer ignore) {
    if (queue.isEmpty()) {
        return false;
    }else {
        queue.remove(0);
        return true;
    }
}