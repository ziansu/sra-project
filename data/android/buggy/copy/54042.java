public void attackersConfirmSameStep(android.content.DialogInterface dialog, int id) {
    mBattlefield.confirmAttack();
    setNextStepButtonText();
    mBinding.nextStep.setEnabled(true);
}