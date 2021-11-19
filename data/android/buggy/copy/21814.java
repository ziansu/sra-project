@org.junit.BeforeClass
public static void setUpClass() {
    jsat.classifiers.linear.kernelized.CSKLRBatchTest.ex = java.util.concurrent.Executors.newFixedThreadPool(SystemInfo.LogicalCores);
}