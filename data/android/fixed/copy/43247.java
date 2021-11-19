@org.junit.Test(expected = java.lang.ClassCastException.class)
public void testWithClassCastException2() {
    java.lang.Long l = 0L;
    okjava.util.Clazz.cast(l, java.lang.String.class);
}