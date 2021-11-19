public boolean restore(android.os.Bundle bundle) {
    if (bundle == null) {
        return false;
    }
    mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}