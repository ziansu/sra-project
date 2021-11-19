public static <D> com.squareup.moshi.JsonAdapter<ru.rinekri.udacitypopularmovies.network.models.PagedResponse<D>> jsonAdapter(com.squareup.moshi.Moshi moshi) {
    return new ru.rinekri.udacitypopularmovies.network.models.AutoValue_PagedResponse.MoshiJsonAdapter(moshi, new java.lang.Class[]{ java.lang.Object.class });
}