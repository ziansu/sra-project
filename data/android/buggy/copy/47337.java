@retrofit2.http.GET(value = "api/v1/merchants")
io.reactivex.Observable<java.util.List<com.oy.test.model.MerchantList>> getMerchantByKeywordAndPage(@retrofit2.http.Query(value = "keyword")
java.lang.String keyword, @retrofit2.http.Query(value = "page")
int page);