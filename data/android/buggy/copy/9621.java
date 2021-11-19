@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.accept_imageview :
            processResponse(1);
            break;
        case R.id.cancel_imageview :
            processResponse(0);
            break;
        case R.id.wait_imageview :
            waitButtonAction(id);
            break;
    }
}