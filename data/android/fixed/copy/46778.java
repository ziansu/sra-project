public void detect_st(java.lang.String str) {
    if (!(str.substring(0, 3).toLowerCase().equals("s.t"))) {
        java.lang.System.out.println(("No constraints have been detected, " + "make sure to enter the keyword <S.T> before your constraints"));
        java.lang.System.exit(1);
    }
}