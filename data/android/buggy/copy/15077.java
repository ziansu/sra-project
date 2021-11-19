java.io.Serializable getData() {
    return org.apache.commons.lang3.SerializationUtils.clone(this.data);
}