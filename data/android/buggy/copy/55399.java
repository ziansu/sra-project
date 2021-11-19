public void add(us.myles.ViaVersion.api.protocol.Protocol protocol) {
    if ((protocolList) != null) {
        java.lang.System.out.println("Adding protocol to list!!");
        protocolList.addLast(protocol);
        protocol.init(userConnection);
    }else {
        throw new java.lang.NullPointerException("Tried to add protocol to early");
    }
}