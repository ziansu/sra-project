@java.lang.Override
public void showHttpError(int statusCode, java.lang.String message) {
    android.widget.Toast.makeText(java.security.AccessController.getContext(), java.lang.String.format("Http error(%d): %s", statusCode, message), Toast.LENGTH_SHORT).show();
}