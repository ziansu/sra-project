@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(76).append("WriteBufferWaterMark [low water mark=").append(writeBufferLowWaterMark);
    append(", high water mark=");
    append(writeBufferHighWaterMark);
    append("]");
    return builder.toString();
}