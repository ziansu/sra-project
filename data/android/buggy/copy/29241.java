@org.junit.Before
public void instantiateFeature() {
    java.lang.String name = "Feature";
    java.lang.String value1 = "Value1";
    java.lang.String value2 = "Value2";
    this.feature = new br.com.algorithms.machine.learning.supervisioned.tree.id3.data.feature.FeatureImpl(name);
    this.feature.addNewValue(value1);
    this.feature.addNewValue(value2);
}