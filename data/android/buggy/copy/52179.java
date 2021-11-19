@java.lang.Override
public void onClick(android.view.View view) {
    activity.clickOnSale(cursor.getLong(cursor.getColumnIndex(StockContract.StockEntry._ID)), quantity);
}