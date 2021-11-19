@org.junit.Test(expected = java.lang.UnsupportedOperationException.class)
public void setObject() {
    org.apache.wicket.model.StringResourceModel model = new org.apache.wicket.model.StringResourceModel("simple.text", page);
    model.setObject("Some value");
}