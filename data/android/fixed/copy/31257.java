@java.lang.Override
public com.wm.lock.entity.Communication findNextWriteCommunication(java.lang.String userJobNumber) {
    return mDaoManager.getCommunicationDao().findNextWrite(userJobNumber);
}