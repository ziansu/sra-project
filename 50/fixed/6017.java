public void setOnItemClickListener(final com.loyalium.cpuloyal.tipcalc.models.TipRecord element, final com.loyalium.cpuloyal.tipcalc.adapters.OnItemClickListener listener) {
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            listener.onItemClick(element);
        }
    });
}