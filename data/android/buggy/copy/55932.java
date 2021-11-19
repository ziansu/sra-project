@java.lang.Override
public void OnCartItemsLoaded() {
    itemsList = mCart.cartProducts;
    adapter.itemsList = itemsList;
    adapter.notifyDataSetChanged();
    android.app.ActionBar actionbar = getActionBar();
    actionbar.setTitle("your text");
}