public long addAttachFile(ntut.csie.ezScrum.web.dataInfo.AttachFileInfo attachFileInfo) {
    ntut.csie.ezScrum.issue.core.IIssue issue = getIssue(attachFileInfo.issueId);
    attachFileInfo.issueType = (issue.getCategory().equalsIgnoreCase(ScrumEnum.STORY_ISSUE_TYPE)) ? ntut.csie.ezScrum.web.dataObject.AttachFileObject.TYPE_STORY : ntut.csie.ezScrum.web.dataObject.AttachFileObject.TYPE_TASK;
    return mAttachFileService.addAttachFile(attachFileInfo);
}