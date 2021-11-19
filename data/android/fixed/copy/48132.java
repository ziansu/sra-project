@java.lang.Override
public void onMatrixError(final org.matrix.androidsdk.rest.model.MatrixError e) {
    onError(e.getLocalizedMessage());
}