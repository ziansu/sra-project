public void addProgress(boolean errorProgress) {
    if ((this.listMovies) != null) {
        this.isErrorProgress = errorProgress;
        this.listMovies.add(null);
        notifyItemInserted(((getItemCount()) - 1));
    }
}