public static synchronized void set(java.lang.Integer transactionID) {
    Chord_Battleship.TransactionID.getInstance().printChange();
    Chord_Battleship.TransactionID.getInstance().id = transactionID;
}