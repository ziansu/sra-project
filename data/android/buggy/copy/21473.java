@java.lang.Override
public void run() {
    while (!(isStopAnim)) {
        int num = mRandom.nextInt(4);
        imageView.setImageResource(mImgsAnim[num]);
    } 
}