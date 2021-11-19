private void constructInitialState() {
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operationsOldApi.DeterminizedState<LETTER, STATE> detState = m_StateDeterminizer.initialState();
    getOrAdd(detState, true, false);
}