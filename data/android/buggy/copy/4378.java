private void enqueueCustomer(Customer c) {
    int q_id = rng.nextInt(numQueues());
    this.queues[q_id].enqueueCustomer(c);
}