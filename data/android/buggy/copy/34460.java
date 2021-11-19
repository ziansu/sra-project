public static void hidePopup() {
    final android.view.WindowManager windowManager = ((android.view.WindowManager) (com.comag.aku.symptomtracker.services.NotificationService.getContext().getSystemService(Context.WINDOW_SERVICE)));
    windowManager.removeView(com.comag.aku.symptomtracker.services.InputPopup.popupLayout);
}