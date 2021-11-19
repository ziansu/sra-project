public void sendTabUpdateNotification(com.mike.item.Tab tab) {
    com.mike.message.EventNotification.TabUpdateNfn tabUpdateNfn = new com.mike.message.EventNotification.TabUpdateNfn(tab);
    sendGateway.send(tabUpdateNfn);
}