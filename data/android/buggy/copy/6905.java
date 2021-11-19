@java.lang.Override
public void done(com.parse.ParseObject object, com.parse.ParseException e) {
    try {
        object.delete();
    } catch (ch.ethz.inf.vs.a4.funwithflags.com.parse e1) {
        e1.printStackTrace();
    }
    ch.ethz.inf.vs.a4.funwithflags.Server.threadsInThisClass.decrementAndGet();
}