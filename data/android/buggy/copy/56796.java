public static void main(java.lang.String[] args) throws minidb.indexmanager.AbstractIndexManagerException {
    minidb.indexmanager.IndexManager im = new minidb.indexmanager.IndexManager();
    minidb.indexmanager.BTree bt = ((minidb.indexmanager.BTree) (im.createBTree("trial2Btree", 2)));
    minidb.recordmanager.RecordID r = new minidb.recordmanager.RecordID();
}