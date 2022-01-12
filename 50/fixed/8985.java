@java.lang.Override
public void doSumWeek(int timeid) {
    assessDao.weekjisuanpianqu(timeid);
    assessDao.weekSumWuye(timeid);
}