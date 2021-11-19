private java.lang.String dayColumnSearch(int day) {
    switch (day) {
        case 0 :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_1;
        case 1 :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_2;
        case 2 :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_3;
        case 3 :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_4;
        case 4 :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_5;
        default :
            return com.wylder.shuttlewidget.ConstraintDatabase.COL_DAY_6;
    }
}