public void commit() {
    recoveryMgr.commit();
    concurMgr.release();
    myBuffers.unpinAll();
    java.lang.System.out.println((("transaction " + (txnum)) + " committed"));
}