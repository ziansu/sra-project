@java.lang.Override
public final void pushAssumption(jbse.mem.Clause c) throws jbse.dec.exc.DecisionException {
    final jbse.mem.Clause cSimpl = simplifyLocal(c);
    pushAssumptionLocal(cSimpl);
    if (hasNext()) {
        this.next.pushAssumption(cSimpl);
    }
}