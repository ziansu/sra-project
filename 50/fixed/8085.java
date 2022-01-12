public void printStateSeq() {
    view.printStateList(clients.selectedClient.getStateList());
    try {
        java.lang.System.out.println("확인 후 아무 키나 누르시오");
        java.lang.System.in.read();
    } catch (java.io.IOException e) {
    }
}