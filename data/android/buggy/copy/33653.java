private boolean sendBroadcast(com.cloudinary.android.sample.model.Resource updatedResource) {
    return android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(new android.content.Intent(com.cloudinary.android.sample.app.CloudinaryService.ACTION_RESOURCE_MODIFIED).putExtra("resource", updatedResource));
}