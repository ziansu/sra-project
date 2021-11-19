@org.junit.Test
public void testFederatorOnFlow() {
    org.o3project.odenos.component.federator.FederatorOnFlow result = new org.o3project.odenos.component.federator.FederatorOnFlow(conversionTable, networkInterfaces, federatorBoundaryTable);
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.notNullValue()));
}