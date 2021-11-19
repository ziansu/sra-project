@org.junit.Test
public void isValid() {
    org.cloudfoundry.client.ValidationResult result = org.cloudfoundry.client.v2.spaces.ListSpaceAuditorsRequest.builder().auditorId("test-auditor-id").id("test-id").build().isValid();
    org.junit.Assert.assertEquals(org.cloudfoundry.client.ValidationResult.Status.VALID, result.getStatus());
}