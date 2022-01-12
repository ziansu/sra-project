@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String value = input.getText().toString();
    if ((value.length()) > 0) {
        addFood(value);
        populateFoodListView();
    }
}