@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.example.rj.cryptodisplay.model.CurrencyAPI>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Error :(", Toast.LENGTH_SHORT).show();
}