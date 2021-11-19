private static com.goat.thirsty_goat.models.User.AccountType getAccountTypeFromString(java.lang.String accountTypeString) {
    switch (accountTypeString) {
        case "Basic User" :
            return com.goat.thirsty_goat.models.User.AccountType.BASICUSER;
        case "Manager" :
            return com.goat.thirsty_goat.models.User.AccountType.MANAGER;
        case "Worker" :
            return com.goat.thirsty_goat.models.User.AccountType.WORKER;
        default :
            return null;
    }
}