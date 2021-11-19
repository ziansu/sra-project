@org.junit.Test
public void testGetPropertyHandler() {
    com.eclipsesource.tabris.maps.MapOperator operator = new com.eclipsesource.tabris.maps.MapOperator(org.mockito.Mockito.mock(android.app.Activity.class), org.mockito.Mockito.mock(com.eclipsesource.tabris.android.TabrisContext.class));
    com.eclipsesource.tabris.android.TabrisPropertyHandler propertyHandler = operator.getPropertyHandler();
    assertTrue((propertyHandler instanceof com.eclipsesource.tabris.maps.MapPropertyHandler));
}