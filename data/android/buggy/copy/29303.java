@java.lang.Override
protected void onPostExecute(java.util.List<java.lang.String> result) {
    if (result != null) {
        ar.com.wolox.unstuckme.utils.QuestionBuilder.onImagesUploaded(result);
    }
}