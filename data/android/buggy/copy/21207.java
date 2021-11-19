public void Initial(java.lang.String sovlverAddress, int port) {
    try {
        test = new org.cripac.isee.pedestrian.attr.ExternPedestrianAttrRecognizer(java.net.Inet4Address.getByName(sovlverAddress), port);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Initialization Failed.");
    }
}