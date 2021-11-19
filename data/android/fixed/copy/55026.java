private static void writeNBTTag(java.io.OutputStream out, nbt.NBTTag tag) throws java.io.IOException {
    writer.NBTWriter.writeNBTTag(out, tag, false);
}