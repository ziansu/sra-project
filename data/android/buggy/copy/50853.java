public void onClick(android.view.View button) {
    int[] location = new int[2];
    cb.getLocationOnScreen(location);
    mColorId = (cb.isChecked()) ? com.sharad.epocket.AddCategoryActivity.UNASSIGNED : color;
    updateColorGroup();
}