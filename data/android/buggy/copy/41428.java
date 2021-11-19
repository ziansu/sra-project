@java.lang.Override
public int hashCode() {
    try {
        return new org.apache.commons.lang.builder.HashCodeBuilder().append(getId()).toHashCode();
    } catch (org.openbase.jul.exception.CouldNotPerformException ex) {
        return new org.apache.commons.lang.builder.HashCodeBuilder().append(internalMessage).toHashCode();
    }
}