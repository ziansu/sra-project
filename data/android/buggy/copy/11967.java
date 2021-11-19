@org.junit.Test
public void testMeteredClassInterface() {
    com.ryantenney.metrics.spring.MeteredClassImpementsInterfaceTest.MeteredClassInterface mi = ctx.getBean(com.ryantenney.metrics.spring.MeteredClassImpementsInterfaceTest.MeteredClassInterface.class);
    org.junit.Assert.assertNotNull("Expected to be able to get MeteredInterface by interface and not by class.", mi);
}