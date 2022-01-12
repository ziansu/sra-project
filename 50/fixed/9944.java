@org.junit.Test
public void getActiveInstrumentBoxes() {
    java.util.List<gui.styling.StyledCheckbox> list = org.mockito.Mockito.mock(java.util.List.class);
    detailViewController.setActiveInstrumentBoxes(list);
    assertEquals(list, detailViewController.getActiveInstrumentBoxes());
}