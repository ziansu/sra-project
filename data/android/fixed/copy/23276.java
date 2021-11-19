@org.junit.Test
public void testInvalidJson() {
    hu.elte.inetsense.web.dtos.JsonMessageObject invalidObject = validator.validate("{\"invalidfield\":\"invalid_value\"}");
    org.junit.Assert.fail();
}