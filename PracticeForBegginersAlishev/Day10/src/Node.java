public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addNewNode(int value) {

        if(value < this.getValue() & left == null) {
            left.setValue(value);
        } else if (value < this.getValue() & left != null) {
            left.addNewNode(value);
        }

        if(value > this.getValue() & right == null) {
            right.setValue(value);
        } else if (value < this.getValue() & right != null) {
            right.addNewNode(value);
        }


    }
}
