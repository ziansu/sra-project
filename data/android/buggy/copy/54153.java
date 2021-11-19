@java.lang.Override
public void call(com.microsoft.office.sfb.sfbdemo.bean.JsonResult<com.microsoft.office.sfb.sfbdemo.bean.FuHui> JsonResult) {
    com.microsoft.office.sfb.sfbdemo.util.L.e("Joy", JsonResult);
    if (isLeave == 2) {
        finish();
        java.lang.System.exit(0);
    }
}