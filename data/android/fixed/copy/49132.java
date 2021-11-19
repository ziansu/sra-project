@org.junit.Test
public void testBothSizeCollections() {
    java.lang.Integer size = My.TestApplicationTests.testList.size();
    java.util.List<My.model.Contact> filterTest = contactService.regExFilterContacts("");
    org.springframework.util.Assert.isTrue(size.equals(filterTest.size()));
}