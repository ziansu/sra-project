@java.lang.Override
public void run() {
    mRecyclerView.findViewHolderForAdapterPosition(i).itemView.performClick();
    getArguments().remove("message");
}