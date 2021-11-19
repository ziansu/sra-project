@org.junit.Test
public void testE() {
    printMatrix(ejercicio3.exerciseE(triangularInferior, triangular1, calculator));
    java.lang.System.out.println(("Operations: " + (calculator.getCount())));
}