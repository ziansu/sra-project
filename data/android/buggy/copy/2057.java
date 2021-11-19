public static void main(java.lang.String[] args) {
    StudentView sv = new StudentView("results1.xml");
    sv.write();
    sv.update("John Black");
}