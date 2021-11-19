@org.junit.Test
public void givenResourceIdBoundAttribute_whenValueModelUpdated_ThenViewShouldReflectChanges() {
    int resourceId = 1;
    org.robobinding.viewattribute.MockPresentationModelAdapterForProperty<java.lang.Integer> mockPresentationModelAdapter = createBoundAttribute(java.lang.Integer.class);
    mockPresentationModelAdapter.updatePropertyValue(resourceId);
    org.junit.Assert.assertEquals(resourceId, shadowView.getBackgroundResourceId());
}