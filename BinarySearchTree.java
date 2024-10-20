public class BinarySearchTree {

    private static class BinaryNode<T> {
        T data = null;
        BinaryNode<T> leftChild = null;
        BinaryNode<T> rightChild = null;

        BinaryNode(T e) {
            this(e, null, null);
        }

        BinaryNode(T e, BinaryNode<T> left, BinaryNode<T> right) {
            this.data = e;
            this.leftChild = left;
            this.rightChild = right;
        }
    }
}
