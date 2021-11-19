public void deleteAll() {
    ServiceClass.root.getChildren().clear();
    for (int i = 0; i < (ServiceClass.node.size()); i++) {
        ServiceClass.node.remove(i);
    }
}