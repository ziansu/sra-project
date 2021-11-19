private void restartServer(shared.data.Bank bank, java.lang.String implementationName) {
    stopBankServer(bank);
    spawnNewProcess(implementationName, bank.name());
    resetState(Constant.MASTER_MACHINE_NAME, implementationName, bank);
}