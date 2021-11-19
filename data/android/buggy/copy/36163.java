@java.lang.Override
public int compare(com.zzzmode.appopsx.ui.model.AppInfo o1, com.zzzmode.appopsx.ui.model.AppInfo o2) {
    if ((o2.installTime) == (o1.installTime)) {
        return 0;
    }
    return (o2.installTime) > (o1.installTime) ? 1 : -1;
}