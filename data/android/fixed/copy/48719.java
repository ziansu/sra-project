private void setViewNext() {
    java.lang.System.out.println("Next");
    model.InventoryItem nextItem = viewList.pNext();
    if (nextItem != null)
        tab.setView(nextItem);
    
}