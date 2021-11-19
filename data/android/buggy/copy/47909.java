@org.junit.Test
public void getId() throws java.lang.Exception {
    gr.aueb.mscis.theater.model.Play a = new gr.aueb.mscis.theater.model.Play("Test", 1997, "test Writer");
    a.setId(1);
    org.junit.Assert.assertEquals(1, a.getId());
}