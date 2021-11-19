public boolean checkUserType(java.lang.String accountType) {
    if (accountType != null) {
        return true;
    }else {
        servlet.addUser.message += "#Choose user type " + "\n";
        java.lang.System.out.println(("#Choose user type " + "\n"));
        return false;
    }
}