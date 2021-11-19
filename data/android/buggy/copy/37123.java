@com.fasterxml.jackson.annotation.JsonIgnore
public java.util.ArrayList<com.example.wduello.collectionmanager.Item> getItemsArrayList() {
    java.util.ArrayList<com.example.wduello.collectionmanager.Item> items = new java.util.ArrayList<com.example.wduello.collectionmanager.Item>(mItems.values());
    return items;
}