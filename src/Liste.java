public class Liste
{
    Node head = null;
    Node tail = null;




    Node insertFromHead(Node node) {

        if (isEmpty()) {
            //er liste tom ;
            head = node;
            tail = node;
            return head;
        }


        //lister er ikke tom
        node.next = head;
        node.previous = node;
        head = node;
        return head;

    }

    boolean isEmpty() {

        return head == null && tail == null;
    }

    String printFromTail() {
        StringBuilder stringBuilder = new StringBuilder();

        Node n = tail;

        while (n != null) {

            stringBuilder.append(n.data + " ");

            n = n.previous;
        }

        return stringBuilder.toString().trim();
    }


     String printFromHead() {

         StringBuilder stringBuilder = new StringBuilder();

         Node n = head;

        while (n != null ) {



            stringBuilder.append(n.data +" ");

            n = n.next;
        }
        return stringBuilder.toString().trim();
    }

}
