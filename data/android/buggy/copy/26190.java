@java.lang.Override
public void onSuccess(com.eeyuva.screens.DetailPage.ArticleDetailResponse responseBody) {
    android.util.Log.e("Response:", new com.google.gson.Gson().toJson(responseBody).toString());
    mView.setOtherArticleDetails(responseBody.getResponse());
}