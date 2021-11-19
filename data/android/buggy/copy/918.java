public java.lang.String getEmail() {
    return phoneAndEmail.getText().split("\\s+")[1].trim();
}