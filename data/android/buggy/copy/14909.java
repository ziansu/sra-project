@java.lang.Override
public void onNetError(com.example.dramtar.testprojectforestafeta.libs.NetWork.NetErrors oError) {
    mNetProgressDialog.dismiss();
    android.widget.Toast.makeText(getContext(), "Error Connection", Toast.LENGTH_LONG);
}