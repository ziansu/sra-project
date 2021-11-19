@java.lang.Override
public void run() {
    mRecyclerView.findViewHolderForAdapterPosition(i).itemView.performClick();
    if (getArguments().containsKey("message"))
        getArguments().remove("message");
    
}