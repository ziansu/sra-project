private void send(com.purber.rest.dto.OrderDto order) {
    com.purber.SendRequestTask task = new com.purber.SendRequestTask();
    task.delegate = this;
    task.execute(order);
}