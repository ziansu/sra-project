public static com.argonmobile.chinagdl.model.VideoItemsModel getInstance() {
    if ((com.argonmobile.chinagdl.model.VideoItemsModel.mInstance) == null) {
        com.argonmobile.chinagdl.model.VideoItemsModel.mInstance = new com.argonmobile.chinagdl.model.VideoItemsModel();
        new com.argonmobile.chinagdl.data.FetchVideoListTask().execute();
    }
    return com.argonmobile.chinagdl.model.VideoItemsModel.mInstance;
}