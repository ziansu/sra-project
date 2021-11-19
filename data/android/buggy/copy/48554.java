private com.interpss.core.acsc.AcscNetwork getAcscNet() throws java.lang.Exception {
    com.interpss.core.acsc.AcscNetwork net = org.interpss.pssl.util.AcscSample.create5BusSampleNet();
    com.interpss.core.algo.LoadflowAlgorithm algo = com.interpss.CoreObjectFactory.createLoadflowAlgorithm(net);
    algo.loadflow();
    org.junit.Assert.assertTrue(net.isLfConverged());
    return net;
}