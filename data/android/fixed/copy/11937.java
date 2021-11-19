@java.lang.Override
protected de.measite.minidns.DNSMessage newQuestion(de.measite.minidns.DNSMessage questionMessage) {
    questionMessage = super.newQuestion(questionMessage);
    return this.newQuestion(questionMessage);
}