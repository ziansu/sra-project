@java.lang.Override
public org.aludratest.jenkins.aludratest.AludratestStatisticsPublisher.AludratestPublisherDescriptor getDescriptor() {
    jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    return jenkins.getDescriptorByType(org.aludratest.jenkins.aludratest.AludratestStatisticsPublisher.AludratestPublisherDescriptor.class);
}