@java.lang.Override
public coneforest.psi.core.PsiBitArray psiNot() {
    final java.util.BitSet result = ((java.util.BitSet) (bitarray.clone()));
    result.flip(0, result.size());
    return new coneforest.psi.core.PsiBitArray(result);
}