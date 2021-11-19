@java.lang.Override
public fr.lirmm.graphik.graal.homomorphism.BacktrackHomomorphism getSolver() {
    return new fr.lirmm.graphik.graal.homomorphism.BacktrackHomomorphism(new fr.lirmm.graphik.graal.homomorphism.BCCScheduler(), new fr.lirmm.graphik.graal.homomorphism.forward_checking.SimpleFC());
}