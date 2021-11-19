public int chooseLine(java.util.ArrayList<java.lang.String> possibleItems) {
    printList(possibleItems);
    application.DataManager.getInstance().savePossibleItems(possibleItems);
    return -1;
}