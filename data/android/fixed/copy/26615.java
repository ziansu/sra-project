public void memorySave(org.ethereum.vm.DataWord addrB, org.ethereum.vm.DataWord value) {
    memory.write(addrB.intValue(), value.getData(), value.getData().length, false);
}