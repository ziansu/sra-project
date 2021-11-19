@java.lang.Override
public void start() {
    netMethod = com.jxnugo.network.JxnuGoNetMethod.getInstance();
    auth = com.jxnugo.utils.AuthUtil.getAuthFromUsernameAndPassword(com.jxnugo.utils.SPUtil.getInstance(mContext).getCurrentUsername(), com.jxnugo.utils.SPUtil.getInstance(mContext).getCurrentPassword());
}