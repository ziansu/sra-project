private void showCustomerTable(final main.model.Customer[] customers) {
    main.controller.CustomerTable table = container.showCustomers(customers);
    if (customers != null) {
        table.addMouseListener(getTableListener(customers));
    }
}