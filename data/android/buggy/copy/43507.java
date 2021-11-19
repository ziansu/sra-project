void moveTo(com.kalita_ivan.gb.lesson1.Box<T> box) {
    box.fruits.clear();
    box.fruits.addAll(this.fruits);
    this.fruits.clear();
}