public static java.lang.Object peek(ArrayQueueADT arrayQueueADT) {
    return arrayQueueADT.elements[((((arrayQueueADT.tail) - 1) + (arrayQueueADT.elements.length)) % (arrayQueueADT.elements.length))];
}