private void handleInteract(game.control.packets.Packet06Interact packet) {
    java.lang.System.out.println("In heres");
    game.handleInteract(packet.getUsername(), packet.getObjectID());
}