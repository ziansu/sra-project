@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.michaelt.paycheckmileagecalculator.fragment.PaycheckInputFragment();
        case 1 :
            return new com.michaelt.paycheckmileagecalculator.fragment.SalaryFragment();
        default :
            break;
    }
    return null;
}