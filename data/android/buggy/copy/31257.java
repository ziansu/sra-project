@java.lang.Override
public com.wm.lock.entity.Communication findNextWriteCommunication(java.lang.String userJobNumber, long currCommunicationId) {
    return mDaoManager.getCommunicationDao().findNextWrite(userJobNumber, currCommunicationId);
}