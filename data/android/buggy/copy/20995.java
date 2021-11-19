@java.lang.Override
public void onFailure(retrofit2.Call<com.doricovix.utif.retrofitgetmysql.ItemResponse> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
    android.util.Log.d("TAG", t.getMessage());
}