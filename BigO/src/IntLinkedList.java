import java.util.LinkedList;

public class IntLinkedList {
    private IntListNode firstNode;
//    private IntListNode lastNode;


    // IntLinkedList stores a list of unique integers
    public IntLinkedList() {

    }

    public void insert(int value) {
            if (firstNode == null) {
                firstNode = new IntListNode(value);
                // TOOD: Add the integer, or take no action if it's already in the list
            }
            else {
                if (!this.contains(value)){
                    IntListNode newNode = new IntListNode(value);
                    newNode.setNextNode(firstNode);
                    firstNode = newNode;
                }
//            IntListNode newNode = new IntListNode(value);
//            IntListNode currentNode = firstNode;
//
//            while(currentNode.getNextNode() != null) {
//                currentNode = currentNode.getNextNode();
//            }
//            currentNode.setNextNode(newNode);
        }
    }

    public boolean contains(int value) {
        if (firstNode == null) {
            throw new IllegalArgumentException();
        }
        IntListNode currentNode = firstNode;
        while(currentNode.getNextNode() != null) {
            if (currentNode.getValue() == value){
                return true;
            }
            currentNode = currentNode.getNextNode(); //next
        }
        if (currentNode.getValue() == value){  //last node
            return true;
        }

        // TODO: Print out if the linked list contains the given integer
        return false;
    }

    public void remove(int value) {
        if(!this.contains(value)) {
            return;
        }
        else {
            int length = findLength();
            int[] shortArray = arrayIt(value, length-1);
//             for(int i = 0; i < shortArray.length; i++)
//                System.out.println(shortArray[i]);
            remake(shortArray);
        }


        // TODO: Remove the given integer from the list, or take no action if it's not in the list
    }

    public int findLength() {
        if (firstNode == null) {
            throw new IllegalArgumentException();
        }
        int counter = 1;
        IntListNode currentNode = firstNode;
        while(currentNode.getNextNode() != null) {
           counter++;
            currentNode = currentNode.getNextNode(); //next
        }


        return counter;
    }


    public  int[] arrayIt(int value, int length) {  //Makes an array of the values minus the value that is being removed
          int[] shortArray = new int[length];
        IntListNode currentNode = firstNode;
        int counter = 0;
//        shortArray[0] = firstNode.getValue();

        while(counter < length ) {

            if (currentNode.getValue() != value) {

                shortArray[counter] = currentNode.getValue();
                counter++;
            }
            currentNode = currentNode.getNextNode(); //next
        }

        return shortArray;
    }

    public void remake(int[] shortArray) {
        int index = shortArray.length - 1;
        firstNode = null;

        for(; index >= 0; index--) {
            insert(shortArray[index]);
        }
    }

    public void print() {
        IntListNode node = firstNode;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNextNode();
        }
    }
}