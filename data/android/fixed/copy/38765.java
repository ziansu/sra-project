@org.junit.Ignore
@org.junit.Test
public void testCommon() throws java.lang.Exception {
    new org.meanbean.test.BeanTester().testBean(easytests.models.IssueModel.class);
    new org.meanbean.test.EqualsMethodTester().testEqualsMethod(easytests.models.IssueModel.class);
    new org.meanbean.test.HashCodeMethodTester().testHashCodeMethod(easytests.models.IssueModel.class);
}