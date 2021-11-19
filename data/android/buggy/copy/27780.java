@org.junit.Test
public void testGetClintDependencyProperty_2() {
    org.talend.core.model.properties.Property property = org.talend.dq.helper.PropertyHelper.createFolderItemProperty();
    java.util.List<org.talend.core.model.properties.Property> clintDependency = org.talend.cwm.dependencies.DependenciesHandler.getInstance().getClintDependency(property);
    org.junit.Assert.assertTrue(((clintDependency.size()) == 0));
}