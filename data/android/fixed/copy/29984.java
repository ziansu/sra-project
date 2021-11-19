public org.jruby.runtime.builtin.IRubyObject decode(org.jruby.Ruby runtime, java.nio.ByteBuffer enc) {
    return runtime.newFixnum(((org.jruby.platform.Platform.BYTE_ORDER) == (org.jruby.platform.Platform.BIG_ENDIAN) ? org.jruby.util.Pack.decodeShortBigEndian(enc) : org.jruby.util.Pack.decodeShortLittleEndian(enc)));
}