public static void buy(int cost) {
    if (!(scondor.panels.ShopHandler.buying)) {
        scondor.server.Client.send(new scondor.packets.Message(((("buy;" + cost) + ";") + "data")));
    }
}