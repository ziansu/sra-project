@org.junit.Test
public void testIgnored3() {
    org.junit.Assert.assertEquals(com.oracle.truffle.r.test.library.base.TestSimpleVectors.TEST_IGNORED3_EXPECTED_VAL, fastREval("{ x <- c(a=as.raw(10),b=as.raw(11),c=as.raw(12),d=as.raw(13)) ; f <- function(s) { x[c(s,s)] } ; f(TRUE) ; f(1L) ; f(as.character(NA)) }"));
}