@java.lang.Override
public java.lang.Number apply(java.lang.Number t, lu.kremi151.minamod.util.nbtmath.util.Context c) {
    if (cond.evaluate(t)) {
        return _then.apply(t, c);
    }else {
        return _else.apply(t, c);
    }
}