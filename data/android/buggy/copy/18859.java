@java.lang.Override
public org.jenkinsci.plugins.pagerduty.PagerDutyTrigger.DescriptorImpl getDescriptor() {
    return jenkins.model.Jenkins.getInstance().getDescriptorByType(org.jenkinsci.plugins.pagerduty.PagerDutyTrigger.DescriptorImpl.class);
}