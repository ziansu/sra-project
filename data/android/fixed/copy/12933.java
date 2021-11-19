private void removeSupplier() {
    Application.Supplier supplier = consoleMenu.getSupplier();
    if (supplier == null)
        return ;
    
    database.RemoveSupplier(consoleMenu.getSupplier());
    java.lang.System.out.println("Supplier removed successfully!");
}