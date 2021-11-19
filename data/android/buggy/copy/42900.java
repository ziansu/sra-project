public void use(com.company.Item item) {
    if ((item.getItemCount()) > 1) {
        item.consume();
    }else {
        inventory.remove(item);
    }
}