public static void main(java.lang.String[] args) {
    project.Client c = new project.Client();
    c.start();
    project.DJProgram djp = new project.LoginWindow(c);
    djp.setVisible(true);
}