akka.actor.ActorRef newTrombone() {
    akka.actor.ActorRef a = javacsw.services.pkg.JSupervisor.create(csw.examples.vsliceJava.assembly.TromboneAssemblyCompTests.assemblyContext.info);
    return a;
}