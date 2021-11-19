@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            listener.onInputDone("男");
            break;
        case 1 :
            listener.onInputDone("女");
            break;
    }
}