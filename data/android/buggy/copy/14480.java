public static synchronized com.fankux.zklocker.ZkLocker getLocker(com.fankux.zklocker.ZkLockerListener listener) {
    if (!(com.fankux.zklocker.ZkLockerFactory.isActive())) {
        com.fankux.zklocker.ZkLockerFactory.initZookeeper();
    }
    return new com.fankux.zklocker.ZkLocker(com.fankux.zklocker.ZkLockerFactory.zookeeper, listener);
}