public static void main(java.lang.String[] args) {
    new blockchain.third.controller.JoinController();
    new blockchain.third.controller.TerminalController().decideOperation();
    blockchain.third.controller.MakeConcensus.listen();
}