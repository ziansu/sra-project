public Result run() {
    java.util.ArrayList<java.lang.String> dataList = simulation.getData();
    checkColor(dataList);
    checkType(dataList);
    checkNumbers(dataList);
    checkRow(dataList);
    checkRange(dataList, ranges);
    return result;
}