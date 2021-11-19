@org.junit.Test
public void whenLongClickingOnView_ThenInvokeCommand() {
    robobinding.binding.viewattribute.OnLongClickAttribute onLongClickAttribute = new robobinding.binding.viewattribute.OnLongClickAttribute(view, commandName);
    onLongClickAttribute.bind(mockPresentationModelAdapter, context);
    com.xtremelabs.robolectric.shadows.ShadowView shadowView = com.xtremelabs.robolectric.Robolectric.shadowOf(view);
    shadowView.performLongClick();
    org.junit.Assert.assertTrue(mockFunction.commandInvoked);
}