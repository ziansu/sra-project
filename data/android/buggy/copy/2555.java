public void setPredecessor(model.Message m) {
    this.predecessor = java.lang.Integer.valueOf(m.Content);
    model.Message sent = new model.Message();
    sent.To = m.Origin;
    sendMessage(m);
}