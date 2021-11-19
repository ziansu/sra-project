public void printMenu() {
    main.java.iterator.diner.Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
    main.java.iterator.diner.Iterator dinerHouseMenuItemsIterator = dinerHouseMenu.createIterator();
    java.lang.System.out.println("Diner House Menu");
    printMenu(dinerHouseMenuItemsIterator);
    java.lang.System.out.println();
    java.lang.System.out.println("Pancake House Menu");
    printMenu(pancakeHouseMenuIterator);
}