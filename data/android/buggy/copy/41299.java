@java.lang.Override
public java.lang.String getPassword() {
    java.lang.System.out.println(("password: " + (credential.get("password"))));
    return credential.get("password");
}