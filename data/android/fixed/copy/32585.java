public void printMenu() {
    java.util.Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
    java.util.Iterator dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();
    java.lang.System.out.println("Diner House Menu");
    printMenu(dinerHouseMenuItemsIterator);
    java.lang.System.out.println();
    java.lang.System.out.println("Pancake House Menu");
    printMenu(pancakeHouseMenuIterator);
}