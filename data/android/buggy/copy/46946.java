@java.lang.Override
protected void onPostExecute(com.alibaba.fastjson.JSONObject jsonArray) {
    cs490.blitz.Tools.postNotification(postid, postusername, "Great! There is someone left message in your post!");
    if (jsonArray != null)
        java.lang.System.out.println(jsonArray.toString());
    
}