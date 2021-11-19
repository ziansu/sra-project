@org.junit.Test
public void initialNodeNotHaveAnyIncomingActivityEdge() throws java.lang.Exception {
    org.eclipse.uml2.uml.InitialNode node = UMLFactory.eINSTANCE.createInitialNode();
    org.junit.Assert.assertFalse(services.isValidActivityEdgeEnd(null, node));
}