@java.lang.Override
protected void onPostExecute(java.util.Collection<lt.ru.lexio.db.Word> words) {
    if (succ)
        wordDAO.update(words);
    
}