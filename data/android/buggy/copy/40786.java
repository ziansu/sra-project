@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.pentaho.reporting.engine.classic.core.ClassicEngineBoot.getInstance().start();
    sortConstraintList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new org.pentaho.reporting.engine.classic.core.sorting.SortConstraint("A", false), new org.pentaho.reporting.engine.classic.core.sorting.SortConstraint("B", true)));
}