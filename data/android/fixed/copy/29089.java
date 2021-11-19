public byte[] saveState(long flags) {
    com.frostwire.jlibtorrent.entry e = new com.frostwire.jlibtorrent.entry();
    s.save_state(e, flags);
    return com.frostwire.jlibtorrent.Vectors.byte_vector2bytes(e.bencode());
}