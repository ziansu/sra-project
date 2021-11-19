@java.lang.Override
public void receiveMessage(se.umu.cs.dist.ht15.dali_ens15bsf.Message m) {
    java.lang.System.out.println("Bngko");
    orderer.addMessage(m);
}