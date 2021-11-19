@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.cit.abakar.application.ExampleClasses.Equipment>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Нет соединения", Toast.LENGTH_SHORT);
    progressBar.setVisibility(View.GONE);
}