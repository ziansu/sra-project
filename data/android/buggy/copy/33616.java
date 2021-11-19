private void connectBudgetAndUser(java.lang.String bid, java.lang.String uid, java.lang.String email) {
    addBudgetToUser(bid, uid);
    addUserToBudget(bid, uid, email);
}