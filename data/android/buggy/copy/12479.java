@org.junit.Test
@org.junit.Ignore
public void should_calculate_answer() {
    logger.NullLogger stubLogger = new logger.NullLogger();
    hitchhicker.HitchHikerGuide guide = new hitchhicker.HitchHikerGuide(stubLogger);
    java.lang.String answer = guide.answer();
    org.junit.Assert.assertThat(answer, org.hamcrest.CoreMatchers.is("42"));
}