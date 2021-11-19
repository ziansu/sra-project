public void changeRoot(int newRootId) {
    mRootId = newRootId;
    mNodeList.get(mRootId).setParentId(edu.cmu.chimps.messageontap_api.ParseTree.NOT_EXIST);
}