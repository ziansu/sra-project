@java.lang.Override
public void onFailure(retrofit2.Call<com.example.rj.cryptodisplay.model.BidData> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Error :(", Toast.LENGTH_SHORT).show();
}