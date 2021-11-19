@java.lang.Override
public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement base, org.junit.runner.Description description) {
    final org.nuxeo.runtime.test.runner.RandomBug.Repeat actual = description.getAnnotation(org.nuxeo.runtime.test.runner.RandomBug.Repeat.class);
    if (actual == null) {
        return base;
    }
    return statement = onRepeat(actual, notifier, base, description);
}