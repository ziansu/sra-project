private void send(com.purber.rest.dto.OrderDto order) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String jsonOrder = gson.toJson(order);
    com.purber.SendRequestTask task = new com.purber.SendRequestTask();
    task.delegate = this;
    task.execute(jsonOrder);
}