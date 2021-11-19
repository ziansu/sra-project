@java.lang.Override
public void addBankAccount(com.project.entity.BankAccount bankAccount) {
    session.save(bankAccount);
    transaction.commit();
    session.close();
    java.lang.System.out.println("Bank Account added!");
}