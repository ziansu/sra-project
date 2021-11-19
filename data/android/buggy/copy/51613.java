@butterknife.OnClick(value = R.id.searchButton)
void searchProducts(android.view.View view) {
    be.fenego.android_spotshop.utilities.ProductUtility.getProductByText(this, searchEditText.getText().toString());
}