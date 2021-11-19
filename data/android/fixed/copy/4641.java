@java.lang.Override
public void exitBinaryStringNullPadded(org.jruby.truffle.format.parser.PackParser.BinaryStringNullPaddedContext ctx) {
    binaryString(((byte) (0)), true, false, ctx.count());
}