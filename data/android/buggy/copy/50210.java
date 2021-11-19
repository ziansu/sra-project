public void updateTrain(com.mercury.beans.Train train) {
    transitd.deleteByTrain(train);
    td.update(train);
    java.lang.System.out.println(train);
}