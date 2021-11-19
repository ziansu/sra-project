public android.graphics.Paint getPaintColorFromUserId(java.lang.String userId) {
    if ((mUserList) != null) {
        return net.aboutgoods.remotedrawing.helper.PaintHelper.createPaintFromRGB(mUserList.get(userId));
    }else {
        return null;
    }
}