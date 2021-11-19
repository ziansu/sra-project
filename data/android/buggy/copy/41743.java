@java.lang.Override
public void onPreExecute() {
    if ((wait) != null) {
        wait.setMessage("Please wait...");
        wait.show();
    }
}