@java.lang.Override
public void changed(int width) {
    java.lang.System.out.println(width);
    setDialogTitleSize(TypedValue.COMPLEX_UNIT_SP, (width / 18));
}