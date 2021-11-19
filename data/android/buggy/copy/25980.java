@java.lang.Override
protected boolean parseHeadData(byte[] head) {
    if ((head.length) < 10)
        throw new java.lang.RuntimeException("need at least 10 bytes for parsing");
    
    length = li.tf.mp3cutter.section.TagID3v2Section.SynchsafeInt2Integer(head, 6);
    return true;
}