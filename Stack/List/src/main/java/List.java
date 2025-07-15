import jdk.nashorn.internal.ir.WhileNode;

import javax.sound.midi.Soundbank;
import javax.xml.soap.Node;
import java.util.HashMap;
import java.util.Scanner;

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


    public ListNode SearchByKeyAndIndex() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value you're looking for: ");
        int key = sc.nextInt();

        System.out.print("Which occurrence? : (Please use integers to explain which occurrence you are looking for)");
        int targetOccurrence = sc.nextInt();

        int index = 0;
        int matchCount = 0;
        ListNode current = head;

        while (current != null) {
            if (current.info == key) {
                matchCount++;

                if (matchCount == targetOccurrence) {
                    System.out.println("Found occurrence #" + matchCount +
                            " at index " + index + " with value " + current.info);
                    return current;
                }
            }

            current = current.nextNode;
            index++;
        }

        System.out.println("The " + targetOccurrence + "th occurrence of value " + key + " was not found.");
        return null;
    }

    public void EraseByNode(ListNode node) {
        if (head == null || node == null) {
            System.out.println("List is empty or node is null.");
            return;
        }

        if (head == node) {
            head = head.nextNode;
            System.out.println("Deleted node from head with value: " + node.info);
            return;
        }


        ListNode current = head;
        while (current.nextNode != null && current.nextNode != node) {
            current = current.nextNode;
        }


        if (current.nextNode == node) {
            current.nextNode = node.nextNode;
            System.out.println("Deleted node with value: " + node.info);
        } else {
            System.out.println("Node not found in the list.");
        }
    }

    public ListNode EraseByKeyAndIndex(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose what number to erase");
            int key = sc.nextInt();

            System.out.println("Which occurrence?");
            int targetOccurrence = sc.nextInt();

            int matchCount=0;
            ListNode current=head;
            ListNode previous=null;

        while(current !=null)
        {
            if(current.info == key)
            {
                matchCount++;
                if(matchCount==targetOccurrence)
                {
                    if (previous == null) {
                        head = current.nextNode;
                    } else {
                        previous.nextNode = current.nextNode;
                    }
                    return current;
                }
            }

            current=current.nextNode;
            previous=current;
        }
        System.out.println("The " + targetOccurrence + "th occurrence of value " + key + " was not found.");
        return null;

        }



}
