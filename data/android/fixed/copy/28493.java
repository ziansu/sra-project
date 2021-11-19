public void onClick(android.view.View v) {
    android.widget.Button addButton = myView.findViewWithTag(v.getTag());
    changeButtonColor(addButton, index);
}