@java.lang.Override
public void onTick(long millisUntilFinished) {
    setText(getContext().getString(R.string.get_verify_code_desc, ((millisUntilFinished / 1000) + currentValue)));
}