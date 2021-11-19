@java.lang.Override
public STATE getOrConstructResultState(final STATE inputState) {
    STATE inputRepresentative = mUnionFind.find(inputState);
    if (inputRepresentative == null) {
        inputRepresentative = inputState;
    }
    return mConstructionCache.getOrConstruct(inputRepresentative);
}