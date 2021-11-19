@org.junit.Test
public void testEqualsDifferentClass() {
    datastructures.Attribute A = new datastructures.Attribute("A");
    assertFalse(mainAttributeJoint.equals(A));
}