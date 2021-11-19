@org.nutz.mvc.annotation.At(value = { "/err/param/pathargs/?" , "/err/param/pathargs/?/?" })
public void errParamWithPathArgs(org.nutz.mvc.impl.AdaptorErrorContext errCtx, java.lang.String a, @org.nutz.mvc.annotation.Param(value = "id")
long id) {
    junit.framework.TestCase.assertNotNull(errCtx);
    junit.framework.TestCase.assertNotNull(errCtx.getErrors()[2]);
}