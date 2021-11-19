public static void main(java.lang.String[] args) {
    byte[] bytes = PacketHelp.makePacket(100);
    java.lang.System.out.println(PacketHelp.get_int(bytes));
}