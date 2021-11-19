@java.lang.Override
public boolean isValidClientInformation() {
    return ((currentId) >= 0) && (clientDescriptor.isValid());
}