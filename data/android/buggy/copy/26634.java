@java.lang.Override
public void insert(int position, M model) {
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemInserted(position);
    contentList.add(position, model);
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeChanged(position, getItemCount());
}