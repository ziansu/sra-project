public void onPageFinished(android.webkit.WebView view, java.lang.String address) {
    android.util.Log.e(ru.kuchanov.odnako.db.ServiceDB.LOG, "onPageFinished");
    view.loadUrl("javascript:console.log('MAGIC'+'<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
}