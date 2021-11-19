@java.lang.Override
public java.lang.String getUsername() {
    java.lang.System.out.println(("username: " + (credential.get("password"))));
    return credential.get("username");
}