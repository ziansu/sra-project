public static void main(java.lang.String[] args) {
    ProjectEuler.Problem20.factorial(100);
    java.lang.System.out.println(ProjectEuler.Problem20.factorial);
    ProjectEuler.CommonMethods cm = new ProjectEuler.CommonMethods();
    java.lang.System.out.println(cm.totalDigits(ProjectEuler.Problem20.factorial.toString()));
}