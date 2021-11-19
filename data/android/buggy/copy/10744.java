public boolean isLessOrEqual(org.sosy_lab.cpachecker.cpa.specinference.SpecInferenceState other) {
    return automaton.toString().equals(other.automaton.toString());
}