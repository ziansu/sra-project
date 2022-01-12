public java.lang.String getEmail() {
    java.lang.String[] split = phoneAndEmail.getText().trim().split("\\s+");
    return split[((split.length) - 1)].trim();
}