@org.junit.Before
public void setup() {
    testingData = setupTestingData(10, 10, 5);
    tree = new RandomForestHOG.DecisionTree.DecisionTree(testingData, 0);
}