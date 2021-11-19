public boolean addConnection(com.chattapp.drafts.Controller.ConBag s) {
    if (!(runningConversations.containsKey(s.socket.getInetAddress().toString()))) {
        return queuedConBags.offer(s);
    }
    return true;
}