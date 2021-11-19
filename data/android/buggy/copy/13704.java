@org.junit.Test
public void testEqualsAttributeJointNullFalse() {
    datastructures.AttributeJoint A = new datastructures.AttributeJoint();
    assertFalse(A.equals(mainAttributeJoint));
}