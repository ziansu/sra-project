public void delete(java.lang.String key) {
    db.delete(leveldb.StorageServiceImpl.bytes(key));
    logger.info(((("Node[" + (node.getHashcode())) + "] DELETE Key:") + key));
}