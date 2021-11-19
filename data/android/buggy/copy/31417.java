public void writeDouble(char pDouble) {
    coremem.offheap.OffHeapMemoryAccess.setDouble(mPosition, pDouble);
    mPosition += 8;
}