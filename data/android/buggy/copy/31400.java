@java.lang.Override
public void encode(org.jruby.ir.persistence.IRWriterEncoder e) {
    super.encode(e);
    e.encode(getSource());
    e.encode(getResult());
}