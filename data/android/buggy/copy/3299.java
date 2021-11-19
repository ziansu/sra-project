private void initialize(java.lang.String newName, int newBalance) {
    userName = newName;
    balance = newBalance;
    score = 0;
    if ((balance) >= 10)
        bet = 10;
    else
        bet = balance;
    
    isPass = false;
    isLose = false;
}