public void removeAllFragments() {
    if ((activity.isFinishing()) || (activity.isDestroyed())) {
        return ;
    }
    activity.getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
}