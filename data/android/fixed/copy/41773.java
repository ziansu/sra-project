@org.junit.Test
public void whenCheckingFitnessForNullSet_thenReturnEmptyList() {
    final java.util.Collection<org.corpus_tools.pepper.modules.PepperModule> modules = null;
    new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(modules).isEmpty();
}