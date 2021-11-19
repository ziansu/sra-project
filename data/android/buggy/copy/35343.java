public org.hibernate.validator.metadata.aggregated.PropertyMetaData build() {
    return new org.hibernate.validator.metadata.aggregated.PropertyMetaData(propertyType, propertyName, adaptOriginsAndImplicitGroups(beanClass, constraints), cascadingMembers, defaultGroupSequenceRedefined, defaultGroupSequence);
}