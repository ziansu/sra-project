public void downloadAttachmentContent(com.taskadapter.redmineapi.bean.Attachment issueAttachment, java.io.OutputStream stream) throws com.taskadapter.redmineapi.RedmineException {
    transport.download(issueAttachment.getContentURL(), new com.taskadapter.redmineapi.internal.CopyBytesHandler(stream));
}