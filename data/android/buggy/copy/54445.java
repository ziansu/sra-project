@org.junit.Test
public void getAttachmentByFileNameRequest_withEmptyAttachmentFileName_throwsIllegalArgumentException() throws java.lang.Exception {
    this.expectedException.expect(java.lang.IllegalArgumentException.class);
    this.expectedException.expectMessage("attachmentFileName must be set");
    this.httpRequestFactory.getAttachmentByFileNameRequest("1234", "");
}