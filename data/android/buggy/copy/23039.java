public void uploadPicture() {
    java.lang.String test = (upLoadServerUri) + (entity.getUploadpath());
    de.edvschuleplattling.mtbdevent.service.strategie.Uploading.FileUploadTask f = ((de.edvschuleplattling.mtbdevent.service.strategie.Uploading.FileUploadTask) (new de.edvschuleplattling.mtbdevent.service.strategie.Uploading.FileUploadTask(pathForUpload).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, test)));
}