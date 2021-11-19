@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    super.onSaveInstanceState(bundle);
    bundle.putSerializable(aaku492.smartfoodtracker.inventory.AddEditItemFragment.ITEM, item);
}