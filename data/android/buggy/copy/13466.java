@java.lang.Override
public fr.lirmm.graphik.graal.homomorphism.BacktrackHomomorphism getSolver() {
    if ((fr.lirmm.graphik.graal.homomorphism.checker.BacktrackChecker.instance) == null)
        fr.lirmm.graphik.graal.homomorphism.checker.BacktrackChecker.instance = new fr.lirmm.graphik.graal.homomorphism.BacktrackHomomorphism(new fr.lirmm.graphik.graal.homomorphism.BCCScheduler(), new fr.lirmm.graphik.graal.homomorphism.forward_checking.SimpleFC());
    
    return fr.lirmm.graphik.graal.homomorphism.checker.BacktrackChecker.instance;
}