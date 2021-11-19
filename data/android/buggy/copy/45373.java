protected org.apache.calcite.test.SqlToRelTestBase.Tester createTester() {
    return new org.apache.calcite.test.SqlToRelTestBase.TesterImpl(getDiffRepos(), false, false, true, null, null);
}