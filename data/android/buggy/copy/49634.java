@org.junit.Test
public void drawCurvetest() {
    com.jme3.scene.Node node = new com.jme3.scene.Node();
    com.funkydonkies.curve.SplineCurveTest.sp.drawCurve(com.funkydonkies.curve.SplineCurveTest.mat, com.funkydonkies.curve.SplineCurveTest.phys, com.funkydonkies.curve.SplineCurveTest.rigid, node);
    org.junit.Assert.assertTrue(((node.getChildren().size()) == 1));
}