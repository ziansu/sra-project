@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.usc.itp476.contact.contactproject.ingamescreen.TargetActivity.REQUEST_TAKE_PHOTO)) && (resultCode == (RESULT_OK))) {
    }else
        if (resultCode == (com.usc.itp476.contact.contactproject.ingamescreen.TargetActivity.RETURN_FROM_RESULT))
            finish();
        
    
}