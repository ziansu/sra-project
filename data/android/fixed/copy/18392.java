@java.lang.Override
public void updateLanguageNames(java.util.List<org.berendeev.translator.domain.entity.Language> languages) {
    if ((adapter) == null) {
        adapter = new org.berendeev.translator.presentation.languagepicker.LanguagePickerAdapter(languages, this);
        recyclerView.setAdapter(adapter);
    }else {
        adapter.update(languages);
    }
}