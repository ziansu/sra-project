@java.lang.Override
protected java.util.ArrayList<com.fsck.k9.activity.misc.Attachment> doInBackground(java.lang.Boolean... params) {
    isDraft = params[0];
    return attachmentPresenter.createAttachmentList();
}