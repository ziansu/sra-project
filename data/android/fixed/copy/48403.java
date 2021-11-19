@java.lang.Override
public boolean isEqual(br.com.objectos.way.auto.core.fakes.Generic<?> o) {
    return br.com.objectos.way.core.testing.Testables.isEqualHelper().equal(name, o.name()).result();
}