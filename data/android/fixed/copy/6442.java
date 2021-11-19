public void onLoadProductsFail() {
    if ((getContext()) != null) {
        android.widget.Toast.makeText(getContext(), R.string.products_load_fail, Toast.LENGTH_SHORT).show();
    }
}