@org.junit.Test
public void testMarshallingJFeedWithStrings() throws java.io.IOException, javax.xml.bind.JAXBException {
    checkXml(stringsFeed);
    checkJson(stringsFeed, new com.fasterxml.jackson.core.type.TypeReference<be.wegenenverkeer.atomium.japi.format.Feed<java.lang.String>>() {    });
}