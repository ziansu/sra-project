public static void main(java.lang.String[] args) {
    java.lang.System.out.println("((2.0*x)*(0.0+2.0))");
    java.lang.System.out.println(new graphingCalculator.Expression("((2.0*x)*(0.0+2.0))"));
    java.lang.System.out.println(graphingCalculator.Simplify.simplify(new graphingCalculator.Expression("((2.0*x)*(0.0+2.0))")));
}