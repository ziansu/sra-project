@java.lang.Override
public void onBindHolder(com.myhexaville.simplerecyclerview.sample.Holder holder, int position) {
    com.myhexaville.simplerecyclerview.sample.model.Movie m = list.get(position);
    holder.binding.setMovie(m);
    holder.binding.text.setText((position + ""));
}