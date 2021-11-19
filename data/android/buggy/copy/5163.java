private void editWord(android.app.Activity activity, lt.ru.lexio.db.Dictionary currentDictionary, java.lang.Integer position) {
    lt.ru.lexio.db.Word word = wordDAO.read(lWords.getItemIdAtPosition(position));
    saveWord(activity, currentDictionary, word);
}