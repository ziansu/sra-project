@java.lang.Override
public void onFailure(com.liangmayong.netbox.throwables.NetboxError error) {
    mRequsetIng = false;
    handleFailure(error);
    if (listener != null) {
        listener.onFailure(error);
    }
}