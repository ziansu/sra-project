@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(getApplication(), "retorfit erro freind", Toast.LENGTH_SHORT).show();
}