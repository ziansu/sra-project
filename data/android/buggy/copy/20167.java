public void run() {
    edu.brown.benchmark.voteresper.tuples.PhoneCall pc = generator.receive();
    cep.getEPRuntime().sendEvent(pc);
}