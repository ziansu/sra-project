@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testGetNonExistentViewWithAccessDeniedView() throws java.lang.Exception {
    allowViews("noview");
    viewProvider.setAccessDeniedViewClass(com.vaadin.spring.internal.SpringViewProviderAccessControlTest.MyAccessDeniedView.class);
    getView("noview");
}