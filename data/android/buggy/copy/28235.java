@java.lang.Override
public void onAuthenticated(com.firebase.client.AuthData authData) {
    fbla.hhs.eclat.DataStorage.setEmail(Email.toString());
    startActivity(Login);
}