public void queueMessage(connection.Message message) {
    synchronized(this.messages) {
        if (this.sendMessages)
            this.messages.add(message);
        
    }
}