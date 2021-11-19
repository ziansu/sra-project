@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    org.matrix.androidsdk.util.Log.d(im.vector.activity.VectorMemberDetailsActivity.LOG_TAG, ("## mCreateDirectMessageCallBack: onMatrixError Msg=" + (e.getLocalizedMessage())));
    mRoomActionsListener.onMatrixError(e);
}