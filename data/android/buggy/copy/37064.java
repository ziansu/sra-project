@org.junit.AfterClass
public static void shutDownServer() throws java.lang.Exception {
    i5.las2peer.services.userInformationService.ServiceTest.node.shutDown();
    i5.las2peer.services.userInformationService.ServiceTest.node = null;
    i5.las2peer.p2p.LocalNode.reset();
}