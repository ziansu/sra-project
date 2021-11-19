@org.junit.Test
public void getFormattedDateString_now() {
    org.hamcrest.MatcherAssert.assertThat(com.ddiehl.timesincetextview.TimeSince.getFormattedDateString(((mTime) - 10), mTime, false, getContext()), com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.is(getContext().getString(R.string.tstv_timespan_now)));
}