@java.lang.Override
public UserType validate(java.lang.String pass) {
    if (pass.equals(this.pass)) {
        return utype;
    }else {
        return null;
    }
}