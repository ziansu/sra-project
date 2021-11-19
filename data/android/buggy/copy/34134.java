public void msgSitAtTable(restaurant.CustomerAgent customer, restaurant.HostAgent.Table table) {
    state = restaurant.WaiterAgent.AgentState.Waiting;
    print("Received msgSitAtTable from the host");
    MyCustomers.add(new restaurant.WaiterAgent.MyCustomer(customer, table));
    stateChanged();
}