@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    try {
        int totalOunces = java.lang.Integer.parseInt(editable.toString());
        mShipItem.setmOunces(totalOunces);
    } catch (java.lang.NumberFormatException e) {
        mShipItem.setmOunces(0);
    }
    updateViews();
}