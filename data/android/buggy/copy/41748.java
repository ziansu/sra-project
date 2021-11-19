public void Delete(android.content.Context context) {
    context.deleteDatabase(InventoryContract.ProductEntry.TABLE_NAME);
}