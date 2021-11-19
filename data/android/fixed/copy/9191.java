@java.lang.Override
public void encode(org.jruby.ir.persistence.IRWriterEncoder e) {
    super.encode(e);
    e.encode(getJumpTarget());
    e.encode(getArg1());
    e.encode(getArg2());
}