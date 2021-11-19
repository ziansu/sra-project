public com.remulasce.lametroapp.dynamic_data.types.Prediction makePrediction() {
    com.remulasce.lametroapp.basic_types.Stop s = new com.remulasce.lametroapp.basic_types.Stop(raw);
    com.remulasce.lametroapp.dynamic_data.types.StopPrediction prediction = new com.remulasce.lametroapp.dynamic_data.types.StopPrediction(s, null);
    return prediction;
}