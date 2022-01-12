public void addItems(java.util.ArrayList<Model.GameObject.Item.Item> items) {
    for (Model.GameObject.Item.Item i : items) {
        if (i != null) {
            this.items.add(i);
        }
    }
    alert();
}