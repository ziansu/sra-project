private void initialize(java.lang.String newName, int newBalance) {
    userName = newName;
    balance = newBalance;
    score = 0;
    isPass = false;
    isLose = false;
    if ((balance) >= 10)
        bet = 10;
    else
        bet = balance;
    
}