@javax.annotation.Nonnull
public com.helger.as4lib.ebms3header.Ebms3MessageProperties createEbms3MessageProperties(@javax.annotation.Nullable
final java.util.List<com.helger.as4lib.ebms3header.Ebms3Property> aEbms3Properties) {
    final com.helger.as4lib.ebms3header.Ebms3MessageProperties aEbms3MessageProperties = new com.helger.as4lib.ebms3header.Ebms3MessageProperties();
    aEbms3MessageProperties.setProperty(aEbms3Properties);
    return aEbms3MessageProperties;
}