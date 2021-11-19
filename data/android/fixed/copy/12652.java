@java.lang.Override
org.apache.hadoop.hdfs.server.blockmanagement.BlockInfo getPenultimateBlock() throws io.hops.exception.StorageException, io.hops.exception.TransactionContextException {
    if ((penultimateBlockId) < 0) {
        return super.getPenultimateBlock();
    }
    return io.hops.transaction.EntityManager.find(BlockInfo.Finder.ByBlockIdAndINodeId, penultimateBlockId, getId());
}