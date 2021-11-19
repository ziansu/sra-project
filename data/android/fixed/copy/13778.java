@org.junit.Test
public void givenResourceIdBoundAttribute_whenValueModelUpdated_ThenViewShouldReflectChanges() {
    int resourceId = 1;
    org.robobinding.viewattribute.MockPresentationModelAdapterForProperty<java.lang.Integer> mockPresentationModelAdapter = createBoundAttribute(int.class);
    mockPresentationModelAdapter.updatePropertyValue(resourceId);
    org.junit.Assert.assertEquals(resourceId, shadowView.getBackgroundResourceId());
}