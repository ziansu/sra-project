public void OnNameChange(java.lang.String name) {
    book.setName(name);
    getViewState().onNameChange();
}