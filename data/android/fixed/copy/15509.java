@java.lang.Override
public io.reactivex.Single<java.util.List<com.example.alexander.weatherapp.data.network.models.places.Prediction>> getAutocomplete(java.lang.String query) {
    return googlePlacesApi.getAutocomplete(query).map(PredictionsResponse::getPredictions);
}