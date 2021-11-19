public boolean isEmpty() {
    for (java.lang.Integer groupId : qMap.keySet()) {
        java.util.Queue<scheduling.Message> queue = qMap.get(groupId);
        if (!(queue.isEmpty()))
            return false;
        
    }
    return true;
}