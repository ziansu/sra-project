public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.xtext.tl.mydsl.FrontEnd fe = new org.xtext.tl.mydsl.FrontEnd(args[0]);
    java.lang.System.out.println(fe);
    org.xtext.tl.mydsl.BackEnd be = new org.xtext.tl.mydsl.BackEnd(fe);
    be.run();
}