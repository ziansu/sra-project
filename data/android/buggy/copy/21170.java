@java.lang.Override
protected void onResume() {
    super.onResume();
    _addItemPresenter.updateDateText();
    if (getIntent().hasExtra(com.david.todo.view.AddItemActivity.NON_DEFAULT_DATE_KEY)) {
        showTimePickButton();
    }
}