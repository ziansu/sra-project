public org.evosuite.testcase.VariableReference createObject(org.evosuite.testcase.TestCase test, java.lang.reflect.Type type, int position, int recursionDepth, org.evosuite.testcase.VariableReference generatorRefToExclude) throws org.evosuite.ga.ConstructionFailedException {
    return createObject(test, type, position, recursionDepth, generatorRefToExclude, true);
}