public boolean addProducts(project.Product product, int count) {
    if (project.Inventory.proList.contains(product)) {
        return false;
    }
    project.Inventory.proList.add(product);
    project.Inventory.map.put(product.getID(), count);
    return true;
}