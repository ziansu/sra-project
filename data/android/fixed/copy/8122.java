public com.java.a35.newsapp.JSONObject searchAllNews(java.lang.String query, int page) throws com.java.a35.newsapp.JSONException, java.io.IOException {
    return searchAllNews(query, page, com.java.a35.newsapp.API.DEFAULT_PAGE_SIZE);
}