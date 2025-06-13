
public class Queue {

    Node firstNode=null;
    Node lastNode=null;
    //size,push,pop,front/back,empty,clear

    public int Size()
    {
        int count=0;

        if(firstNode==null)
        {
            return 0;
        }
        else if(lastNode==null)
        {
            return 1;
        }


        Node aux = firstNode;
        do{
            count++;
            aux=aux.nextNode;
        }while(aux!=firstNode);
        return count;


    }

    public void Push(int x)
    {
        if(firstNode == null )
        {
            firstNode= new Node(x,null);
            lastNode=firstNode;
            firstNode.nextNode=lastNode;

        }
        else if( lastNode==null)
        {
            lastNode = new Node(x,firstNode);
            firstNode.nextNode=lastNode;
        }
        else {
            Node aux = new Node(x, firstNode);
            lastNode.nextNode = aux;
            lastNode = aux;

        }

    }

    public void Pop() {
        if (firstNode == null) {
            System.out.println("Queue is empty. Nothing to pop.");
            return;
        }

        System.out.println("Popped: " + firstNode.info);

        if (firstNode == lastNode) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
            lastNode.nextNode = firstNode;
        }
    }


    public Node Front() {
        if (firstNode == null) {
            System.out.println("Queue is empty.");
            return null;
        }

        System.out.println("Front: " + firstNode.info);
        return firstNode;
    }



    public Node Back()  {
        if (lastNode == null) {
            System.out.println("Queue is empty.");
            return null;
        }

        System.out.println(" Back : " + lastNode.info);
        return lastNode;
    }


    public void Empty()
    {
        if(firstNode == null)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

    public void Clear()
    {
        int count = Size();
        for(int i = 0; i<count;i++)
        {
            Pop();
        }
    }

    public Queue(Node firstNode,Node lastNode)
    {
        this.firstNode=firstNode;
        this.lastNode=lastNode;
    }
    public Queue(Node firstNode)
    {
        this.firstNode=firstNode;
        this.lastNode=null;
    }
    public Queue()
    {
        this.firstNode=null;
        this.lastNode=null;
    }

    public String Display() {
        StringBuilder sb = new StringBuilder();
        Node aux = firstNode;

        if (aux != null) {
            do {
                sb.append(aux.info);
                aux = aux.nextNode;
                if (aux != firstNode) {
                    sb.append(" -> ");
                }
            } while (aux != firstNode);
        }

        return sb.toString();
    }

}
