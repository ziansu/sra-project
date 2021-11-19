public void handleStatusUpdate(org.json.JSONObject obj) {
    int newStatus = obj.getInt("makingProgress");
    if (newStatus != (predictions.ADocumentPredictionManager.currentStatus)) {
        predictions.ADocumentPredictionManager.currentStatus = newStatus;
    }
}