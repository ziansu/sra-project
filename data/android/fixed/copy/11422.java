@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    android.widget.Toast.makeText(getContext(), getString(R.string.internet_connection_message), Toast.LENGTH_SHORT).show();
}