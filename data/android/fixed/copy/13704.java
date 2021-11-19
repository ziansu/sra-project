@org.junit.Test
public void testEqualsAttributeJointNullFalse() {
    datastructures.AttributeJoint a = new datastructures.AttributeJoint();
    assertFalse(a.equals(mainAttributeJoint));
}