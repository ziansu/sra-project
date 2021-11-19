@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable drawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(context.getResources(), resource);
    drawable.setCircular(true);
    holder.sponsorimage.setImageDrawable(drawable);
}