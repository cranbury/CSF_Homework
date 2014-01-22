import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.Queue;


public class IntBST {
    private Node root;

    public String bfsRepresentation() {

        // TODO: Return a string representation of a breadth-first search of this tree.
        // Nodes are space-delimited, e.g. "1 2 4 5"
        // Hint: Use a queue and, starting with the root node, then enqueue its left and right children.
        // Hint: The StringBuilder class is useful for constructing strings that are constantly appended to

        StringBuilder bfs = new StringBuilder();

        if (root != null) {
            LinkedList<Node> queue = new LinkedList<Node>();
            Node currentNode = root;
            queue.push(currentNode);

            while(queue.size() > 0) {
                currentNode = queue.removeFirst();
                Integer value = currentNode.getValue();
                bfs.append(value).append(" ");

                if (currentNode.getLeftNode() != null) {
                    queue.addLast(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    queue.addLast(currentNode.getRightNode());
                }
            }
        }


       String result = bfs.toString();
        return result.trim();
    }

    public void insertValue(int value) {
        // TODO: Insert a value into the tree, maintaining the 'binary' property of the tree.
        Node newNode = new Node(value);

        if (root == null) {
            root =  newNode;
        }
        else {
            Node currentNode = root;


            while(currentNode.getValue() != value) {
                if(value < currentNode.getValue()) {
                    if (currentNode.getLeftNode() == null) {
                        currentNode.setLeftNode(newNode);
                    }
                    else {
                        currentNode = currentNode.getLeftNode();
                    }
                }
                else if (value > currentNode.getValue()) {
                    if (currentNode.getRightNode() == null) {
                        currentNode.setRightNode(newNode);
                    }
                    else {
                        currentNode = currentNode.getRightNode();
                    }
                }
            }
        }

       //throw new NotImplementedException();
    }

    public boolean search(int value) {
        // TODO: Return whether the tree contains a given value
        throw new NotImplementedException();
    }

    public void remove(int value) {
        // TODO: Optional Challenge question
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R
        throw new NotImplementedException();
    }
}
