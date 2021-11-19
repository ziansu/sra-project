@java.lang.Override
public edu.umd.cs.psl.model.parameters.Weight duplicate() {
    return new edu.umd.cs.psl.model.parameters.PositiveWeight(getWeight(), true);
}