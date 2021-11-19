private void removeSupplier() {
    Application.Supplier supplier = consoleMenu.getSupplier();
    if (supplier == null) {
        java.lang.System.out.println("No suppliers found. terminating.");
        return ;
    }
    database.RemoveSupplier(consoleMenu.getSupplier());
    java.lang.System.out.println("Supplier removed successfully!");
}