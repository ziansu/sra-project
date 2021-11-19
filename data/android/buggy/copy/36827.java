@java.lang.Override
public H.Response writeBinary(org.osgl.storage.ISObject binary) {
    this.binary = binary.asByteArray();
    org.osgl.util.IO.copy(org.osgl.storage.impl.SObject.of(this.binary).asInputStream(), realResponse.outputStream(), false);
    return this;
}