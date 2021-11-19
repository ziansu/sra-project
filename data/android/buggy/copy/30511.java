@java.lang.Override
public void onCompleted(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo, net.gotev.uploadservice.ServerResponse serverResponse) {
    attach.hasUpload = true;
    cb.success();
}