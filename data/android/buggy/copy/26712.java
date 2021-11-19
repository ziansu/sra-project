@java.lang.Override
public void onCancelled(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo) {
    attach.hasUpload = false;
    cb.failed("上传失败");
}