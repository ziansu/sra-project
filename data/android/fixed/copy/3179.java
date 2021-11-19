protected org.apache.ignite.internal.binary.BinaryMarshaller binaryMarshaller(org.apache.ignite.binary.BinaryNameMapper nameMapper, org.apache.ignite.binary.BinaryIdMapper mapper, java.util.Collection<org.apache.ignite.binary.BinaryTypeConfiguration> cfgs) throws org.apache.ignite.IgniteCheckedException {
    return binaryMarshaller(nameMapper, mapper, null, cfgs, null);
}