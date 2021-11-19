@java.lang.Override
public java.util.List<? extends com.ribose.jenkins.plugin.awscodecommittrigger.interfaces.SQSQueue> getSqsQueues() {
    @javax.annotation.Nonnull
    final com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.DescriptorImpl descriptor = ((com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.DescriptorImpl) (jenkins.model.Jenkins.getActiveInstance().getDescriptor(com.ribose.jenkins.plugin.awscodecommittrigger.SQSTrigger.class)));
    return descriptor.getSqsQueues();
}