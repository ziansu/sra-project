@java.lang.Override
public void onEditCancelled() {
    android.widget.Toast.makeText(this, "They cancelled (fragment)", Toast.LENGTH_SHORT).show();
    net.idfernando.android.uitools.FragmentTools.removeFragment(this, net.idfernando.android.shoppinglist.EditShoppingListActivity.ADD_OR_EDIT_SHOPPING_ITEM_FRAGMENT);
}