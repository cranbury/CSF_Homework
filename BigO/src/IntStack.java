
public class IntStack {
    IntListNode firstNode;

    public IntStack() {
    }

    public void push(int value) {
        if (firstNode == null) {
            firstNode = new IntListNode(value);
        }
        else {
            IntListNode newNode = new IntListNode(value);
            newNode.setNextNode(firstNode);
            firstNode = newNode;

            // TODO: Add a value to the top of the stack
        }
    }

    public int pop() {
        if (firstNode == null){
            throw new IllegalArgumentException();
        }
        else {
            IntListNode returnNode = firstNode;
            if (firstNode.getNextNode() != null) {
                firstNode = firstNode.getNextNode();
            }
            else {
                firstNode = null;
            }
            // TODO: Pop the first value off the statck
            return returnNode.getValue();
        }
    }

    public int size() {
        if (firstNode == null){
            throw new IllegalArgumentException();
        }

        int counter = 1;
        IntListNode currentNode = firstNode;

        while(currentNode.getNextNode() != null) {
             counter++;
            currentNode = currentNode.getNextNode(); //next
        }
        // TODO: Fill out this method
        return counter;
    }
}