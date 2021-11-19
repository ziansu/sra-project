@java.lang.Override
public void onInput(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, java.lang.CharSequence input) {
    addStockQuote(input.toString().replaceAll("\\s", "").toUpperCase());
}