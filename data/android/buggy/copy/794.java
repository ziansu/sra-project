@java.lang.Override
public void setOrganization(com.google.common.base.Optional<fi.helsinki.cs.tmc.core.domain.Organization> org) {
    if (org.isPresent()) {
        this.organization = org.get();
    }
}