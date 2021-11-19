@java.lang.Override
public org.apache.nifi.controller.repository.FlowFileFilterResult filter(final org.apache.nifi.flowfile.FlowFile flowFile) {
    if ((++(polled)) < maxResults) {
        return FlowFileFilterResult.ACCEPT_AND_CONTINUE;
    }else {
        return FlowFileFilterResult.ACCEPT_AND_TERMINATE;
    }
}