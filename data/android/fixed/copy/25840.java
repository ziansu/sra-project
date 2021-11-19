@org.junit.Test
public void testEqualsAttributeJointNullTrue() {
    datastructures.AttributeJoint a = new datastructures.AttributeJoint();
    datastructures.AttributeJoint b = new datastructures.AttributeJoint();
    assertTrue(a.equals(b));
}