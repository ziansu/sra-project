private void makeRequest() {
    java.lang.ref.ReferenceQueue requestQueue = br.com.nannygo.app.Volley.newRequestQueue(this);
    br.com.nannygo.app.StringRequest request = new br.com.nannygo.app.StringRequest(DownloadManager.Request.Method.POST, "localhost");
}