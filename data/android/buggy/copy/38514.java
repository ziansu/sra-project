@org.junit.Test
public void testDeeper() {
    messages.DEPTH_COMPARISON message = new messages.DEPTH_COMPARISON();
    message.setComparison(DepthComparison.FIRSTDEEPER);
    simplenlg.framework.NLGElement element = this.microplanner.planDepthComparison(message);
    org.junit.Assert.assertNotNull(element);
}