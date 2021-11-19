public void addMessage(android.view.View view) {
    messageList.addView(view);
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            messageWindow.fullScroll(ScrollView.FOCUS_DOWN);
        }
    });
}