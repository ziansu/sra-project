@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        displayFileChooser();
    }else {
        requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, com.matthias.android.amginori.fragments.MainFragment.REQUEST_READ_EXTERNAL_STORAGE_CODE);
    }
}