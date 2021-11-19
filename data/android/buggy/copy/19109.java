@java.lang.Override
public void onArmSync(com.thalmic.myo.Myo myo, long timestamp, com.thalmic.myo.Arm arm, com.thalmic.myo.XDirection xDirection) {
    mTextView.setText(((myo.getArm()) == (com.thalmic.myo.Arm.LEFT) ? R.string.arm_left : R.string.arm_right));
}