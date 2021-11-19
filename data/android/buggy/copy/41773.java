@org.junit.Test
public void whenCheckingFitnessForNullSet_thenReturnEmptyList() {
    java.util.Collection<org.corpus_tools.pepper.modules.PepperModule> modules = null;
    new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(modules).isEmpty();
}