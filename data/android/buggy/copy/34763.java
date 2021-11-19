@java.lang.Override
public void onClick(android.view.View p1) {
    switch (Listener) {
        case "update" :
            dialog.dismiss();
            break;
        default :
            finish();
            break;
    }
}