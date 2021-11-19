@java.lang.Override
public void onClick(android.view.View v) {
    es.dmoral.toasty.Toasty.success(this, "Change Location", Toast.LENGTH_SHORT).show();
    showCityInput();
}