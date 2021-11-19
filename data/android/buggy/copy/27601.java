@java.lang.Override
public void onFailure(retrofit2.Call<java.lang.String> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getActivity(), "An error occurred", Toast.LENGTH_SHORT).show();
    android.util.Log.d("TAG", java.lang.String.valueOf(t));
}