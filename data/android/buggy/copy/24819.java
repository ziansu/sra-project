public void hide() {
    shown = false;
    setVisibility(View.GONE);
    plane.waiting.push(this);
}