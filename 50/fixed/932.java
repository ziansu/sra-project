@java.lang.Override
public void onFailure(com.hanvon.rc.md.camera.HttpException e, java.lang.String s) {
    android.util.Log.i(com.hanvon.rc.md.camera.UploadImage.TAG, ("===onFailure=====" + s));
    android.os.Message msg = new android.os.Message();
    msg.what = com.hanvon.rc.utils.InfoMsg.FILE_RECO_FAIL;
    msg.obj = s;
    com.hanvon.rc.md.camera.UploadImage.handler.sendMessage(msg);
}