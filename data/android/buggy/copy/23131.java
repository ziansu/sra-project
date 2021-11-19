@java.lang.Override
public int hashCode() {
    return new org.apache.commons.lang3.builder.HashCodeBuilder().appendSuper(getJournalID().hashCode()).appendSuper(getUserID().hashCode()).toHashCode();
}