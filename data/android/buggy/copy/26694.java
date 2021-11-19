@java.lang.Override
public void onClick(android.view.View view) {
    activity.clickOnViewItem(cursor.getLong(cursor.getColumnIndex(StockContract.StockEntry._ID)));
}