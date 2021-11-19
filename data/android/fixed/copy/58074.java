static void NoticeProcesser(GameServer.User user) {
    synchronized(GameServer.Server.UserProcessQueue) {
        GameServer.Server.UserProcessQueue.offer(user);
        GameServer.Server.UserProcessQueue.notify();
    }
}