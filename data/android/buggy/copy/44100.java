@java.lang.Override
public java.util.List<java.lang.String> getRecipients(org.tdl.vireo.model.Submission submission) {
    return org.tdl.vireo.services.EmailByRecipientType.getRecipients(submission, recipientType);
}