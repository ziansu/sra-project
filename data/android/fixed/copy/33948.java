@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    timber.log.Timber.d("Yes for enjoying betch clicked");
    dialogInterface.dismiss();
    getAppStoreDialog().show();
}