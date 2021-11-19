@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = "facade/wishlist/entry/add")
retrofit2.Call<java.lang.Void> addToWishlistAsync(@retrofit2.http.Field(value = "wishlistCode")
java.lang.String wishlistCode, @retrofit2.http.Field(value = "productCode")
java.lang.String productCode, @retrofit2.http.Field(value = "desired")
int desired, @retrofit2.http.Field(value = "comment")
java.lang.String comment);