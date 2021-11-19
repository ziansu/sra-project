@org.junit.Test
public void isResultBitArraySizeEquals5WhenInputSize5() {
    viewModel.setArraySize("5");
    viewModel.initializeArray();
    assertEquals(viewModel.getResultBitArray().getSize(), 5);
}