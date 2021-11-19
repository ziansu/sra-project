@org.junit.Ignore
@org.junit.Test
public void testGetNonExistentViewWithAccessDeniedView() throws java.lang.Exception {
    allowViews("noview");
    viewProvider.setAccessDeniedViewClass(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.MyAccessDeniedView.class);
    org.junit.Assert.assertTrue("Got something else when should get access denied view for non-existent view name", ((getView("noview")) instanceof com.vaadin.spring.internal.SpringViewProviderAccessControlTest.MyAccessDeniedView));
}