public synchronized network.models.JSONMessageResponse.Message tryDequeue() {
    while (true)
        try {
            wait();
            break;
        } catch (java.lang.InterruptedException e) {
            continue;
        }
    
    return messageQueue.poll();
}