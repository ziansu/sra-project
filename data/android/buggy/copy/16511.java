public void recieveShowings(objects.CalendarDate calendarDate) {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            view.getShowings(calendarDate);
        }
    });
}