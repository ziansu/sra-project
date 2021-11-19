@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (!(getPage().onActivityResult(requestCode, requestCode, data)))
        controller.onActivityResult(requestCode, resultCode, data);
    
}