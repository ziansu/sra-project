@java.lang.Override
public boolean isEqual(br.com.objectos.way.auto.core.fakes.Generic<?> o) {
    br.com.objectos.way.auto.core.fakes.GenericPojo<?> that = br.com.objectos.way.auto.core.fakes.GenericPojo.class.cast(o);
    return br.com.objectos.way.core.testing.Testables.isEqualHelper().equal(this.name, that.name).result();
}