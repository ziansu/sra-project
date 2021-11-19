private void initializeTextViewWithShoppingListName() {
    shoppingListDAO.open();
    java.lang.String shoppingListName = shoppingListDAO.getOne(shoppingListId).getName();
    getActivity().setTitle(shoppingListName);
}