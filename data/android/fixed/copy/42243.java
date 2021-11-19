@java.lang.Override
public java.lang.Number getValue() {
    java.util.concurrent.atomic.LongAdder tmp = adder;
    adder = new java.util.concurrent.atomic.LongAdder();
    return tmp.intValue();
}