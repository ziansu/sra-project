@java.lang.Override
protected void onActivityResult(int request, int response, android.content.Intent data) {
    super.onActivityResult(request, response, data);
    mHelper.onActivityResult(request, response);
}