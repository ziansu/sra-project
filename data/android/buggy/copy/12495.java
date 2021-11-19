@java.lang.Override
protected void onPostExecute(java.util.List<de.simontenbeitel.regelfragen.objects.Question> questions) {
    super.onPostExecute(questions);
    db.close();
    if (null != (mCallback))
        mCallback.onQuestionsLoadFinished(questions);
    
}