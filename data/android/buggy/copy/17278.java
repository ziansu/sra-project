public void clientQuit(long ID) {
    mClients.remove(ID);
    broadcast(new qstp.Message("MESSAGE", (-1), (("Client ID: " + ID) + " - connection terminated!")), (-1));
}