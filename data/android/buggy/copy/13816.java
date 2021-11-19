public byte[] toJSONBytes() {
    java.lang.String s = this.toJSON().toString();
    return s == null ? null : s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
}