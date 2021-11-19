public static void assertEquals(int value1, int value2, java.lang.String message) {
    org.eclipse.osee.framework.jdk.core.util.Conditions.checkExpressionFailOnTrue((value1 != value2), (message + " - Expected %d; Actual %d"), value1, value2);
}