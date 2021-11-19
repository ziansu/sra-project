public static android.net.Uri appendDistinct(@android.support.annotation.NonNull
final android.net.Uri uri) {
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_DISTINCT, "distinct").build();
}