public void markPartial(java.lang.String caller) {
    this.caller = caller;
    this.operator = "";
    this.status = net.bubbaland.trivia.Answer.Status.PARTIAL;
}