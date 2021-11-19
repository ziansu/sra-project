@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (!(getPage().onActivityResult(requestCode, resultCode, data)))
        controller.onActivityResult(requestCode, resultCode, data);
    
}