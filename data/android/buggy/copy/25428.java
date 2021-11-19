java.lang.String getSaveAsFilename() {
    ca.rmen.android.poetassistant.main.reader.PoemFile poemFile = mPoemPrefs.getSavedPoem();
    if (poemFile != null) {
        return poemFile.name;
    }else {
        return ca.rmen.android.poetassistant.main.reader.PoemFile.generateFileName(poem.get().toString());
    }
}