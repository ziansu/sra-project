@java.lang.Override
public void run() {
    if ((targetTranslationSlugs.length) > 0) {
        adapter.setTargetTranslations(targetTranslationSlugs);
    }else {
        notifyReadOnlineBackupsFailed();
        dismiss();
    }
}