@java.lang.Override
public org.hibernate.validator.metadata.aggregated.ParameterMetaData build() {
    return new org.hibernate.validator.metadata.aggregated.ParameterMetaData(adaptOriginsAndImplicitGroups(rootClass, constraints), isCascading, name, parameterType, parameterIndex, defaultGroupSequenceRedefined, defaultGroupSequence);
}