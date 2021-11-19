@java.lang.Override
public void onFailure(com.liangmayong.netbox.throwables.NetboxError error) {
    mRequsetIng = false;
    handleFailure(error);
    listener.onFailure(error);
}