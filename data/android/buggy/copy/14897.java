public void setAuthorized(java.util.Set<com.Responsible> authorized) {
    Authorized = authorized;
    for (com.Responsible individual : authorized) {
        individual.setAccountNumber(this.getAccountNum());
        individual.setCustomerId(this.getId());
    }
}