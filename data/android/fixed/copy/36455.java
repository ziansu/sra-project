@org.junit.Test
public void testHashSetParametrized() {
    java.util.Set<java.lang.Integer> set = this.createResizedDS(0, 100000);
    this.parameterized(set, set, set.toString());
}