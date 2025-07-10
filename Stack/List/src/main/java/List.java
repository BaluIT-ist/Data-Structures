import javax.xml.soap.Node;

public class List {

    ListNode head=null;

    public ListNode First()
    {
        if(head == null)
        {
            System.out.println("There's not a first number(is an empty list)");
            return null;
        }

        System.out.println("The first term of the list is : " + head);
        return head;
    }

    public ListNode Last() {
        if (head == null) {
            System.out.println("There's not a last number (it's an empty list)");
            return null;
        }

        ListNode aux = head;
        while (aux.nextNode != null) {
            aux = aux.nextNode;
        }

        System.out.println("The last term of the list is: " + aux.info);
        return aux;
    }

    public int Size()
    {
        int count =0;

        if(head == null )
        {
            return count;
        }


        ListNode aux = head;
        do{
            count++;
            aux=aux.nextNode;
        }while(head.nextNode!=null);

            return count;

    }

        public void PushFront(int x)
        {
            ListNode aux = new ListNode(x,null);
            if(head==null)
            {
                head=aux;
            }
            else
            {

                aux.nextNode=head;
                head=aux;

            }
        }

        public void PushBack(int x)
        {
            ListNode aux = new ListNode(x,null);
            if(head==null)
            {
                head=aux;
                aux.nextNode = aux;

            }
            else{
                ListNode aux2= head;
                while (aux2.nextNode != null) {
                    aux2 = aux2.nextNode;
                }
                aux2.nextNode=aux;
            }
        }

}
