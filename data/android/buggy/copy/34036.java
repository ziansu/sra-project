@java.lang.Override
public int[] getDataFieldArray() {
    if ((dataArray) == null) {
        dataArray = new int[numberOfInputSlots()];
    }
    return dataArray;
}