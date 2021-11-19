@java.lang.Override
protected java.util.Collection<cc.mallet.types.Instance> balanceHook(cc.mallet.types.InstanceList classInstances, int n) {
    if (n > (classInstances.size()))
        return data.balancing.SMOTE.smote(classInstances, n, k);
    else
        return undersample(classInstances, n);
    
}