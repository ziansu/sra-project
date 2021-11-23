public static com.punchthrough.bean.sdk.message.ScratchData fromPayload(okio.Buffer buffer) {
    return new com.punchthrough.bean.sdk.message.AutoParcel_ScratchData(((buffer.readByte()) & 255), buffer.readByteArray());
}