@org.junit.Test
public void shouldScheduleTaskAppropriately() {
    org.mockito.Mockito.verify(timer).schedule(task, uk.dangrew.jupa.update.download.NotificationSchedulerTest.PERIOD);
}