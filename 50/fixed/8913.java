@org.junit.Test
public void testEqualsAttributeJointInverse() {
    datastructures.AttributeJoint a = new datastructures.AttributeJoint();
    assertFalse(mainAttributeJoint.equals(a));
}