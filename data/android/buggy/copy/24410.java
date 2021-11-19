public Vector.BookVector[] recommendBook(int userID, int amount) {
    java.util.PriorityQueue<Vector.KNNUserVector> users = findSimiUser(userID, 10);
    return knnSearch(users, amount);
}