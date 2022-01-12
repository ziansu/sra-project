public void initialize(java.lang.String[] args) {
    super.initialize(args);
    nachos.vm.VMKernel.pageTable = new java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, nachos.vm.TranslationEntry>>();
}