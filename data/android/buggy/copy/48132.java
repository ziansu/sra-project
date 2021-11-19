@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    onError(e.getLocalizedMessage());
}