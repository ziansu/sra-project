public void addTrain(TrainSchedule.Train currentTrain) {
    if (currentTrain == null)
        throw new java.lang.NullPointerException("Train cannot be null");
    
    trainStorage.add(currentTrain);
}