public static void addTrainLine(controller.TrainLine trainLine) {
    controller.ContentController.trainPlan.addTrainLine(trainLine);
    controller.ContentController.activeTrainline = trainLine;
    controller.ContentController.trainPlan.addTrainLine(trainLine);
}