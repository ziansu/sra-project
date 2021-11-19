@java.lang.Override
public java.lang.Boolean deserialise(final byte[] allBytes, final int offset, final int length) throws uk.gov.gchq.gaffer.exception.SerialisationException {
    return ((allBytes.length) == 1) && ((uk.gov.gchq.gaffer.serialisation.implementation.BooleanSerialiser.TRUE) == (allBytes[offset]));
}