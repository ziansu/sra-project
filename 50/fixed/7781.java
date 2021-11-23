@java.lang.Override
public void onChanged() {
    if ((com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem) != null) {
        com.example.terz99.digitalmenuv2.MyOrderActivity.totalPrice -= (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmPrice()) * ((double) (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmQuantity()));
        com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem = null;
        setTotalPrice();
    }
}