public br.com.algorithms.machine.learning.supervisioned.tree.id3.data.feature.FeatureImpl addNewValue(java.lang.String value) {
    if (!(this.values.contains(value))) {
        this.values.add(value);
    }
    return this;
}