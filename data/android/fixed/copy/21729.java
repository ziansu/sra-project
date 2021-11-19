public static boolean restore(android.support.v4.app.FragmentActivity target) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(target.getClass());
    if (retainer != null) {
        return retainer.restore(target);
    }else {
        return false;
    }
}