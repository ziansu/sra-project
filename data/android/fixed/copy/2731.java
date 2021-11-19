public void getPredecessor(model.Message m) {
    model.Message sent = new model.Message();
    sent.To = m.Origin;
    sent.Content = java.lang.String.valueOf(predecessor);
    sendMessage(sent);
}