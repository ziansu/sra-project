private org.o3project.odenos.component.federator.FederatorOnFlow createPowerTarget() throws java.lang.Exception {
    target = org.powermock.api.mockito.PowerMockito.spy(new org.o3project.odenos.component.federator.FederatorOnFlow(conversionTable, networkInterfaces));
    return target;
}