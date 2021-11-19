@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (callback != null) {
        callback.invoke(okTitle_f);
    }
}