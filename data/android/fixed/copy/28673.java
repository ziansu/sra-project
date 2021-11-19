@java.lang.Override
public void editContent(eionet.doc.dto.DocPageDTO pageObject) throws java.lang.Exception {
    if (pageObject != null) {
        this.insertContent(pageObject, true);
    }
}