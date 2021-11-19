@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, java.lang.String responseString) {
    (successCount)++;
    com.ywwxhz.data.impl.NewsDetailProvider.handleResponceString(item, responseString, cacheImage);
}