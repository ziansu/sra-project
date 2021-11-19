@org.junit.Test
public void generateNewId_LineBreak() {
    s.setName("id\n1 (2.5)");
    gen = new org.oscm.ui.generator.IdGenerator("", s, new java.util.ArrayList<org.oscm.internal.vo.VOSubscription>());
    org.junit.Assert.assertEquals("id\n1 (2.5)", gen.generateNewId());
}