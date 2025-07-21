public class ListNode {
    int info;
    ListNode nextNode=null;

    public ListNode(int info,ListNode node)
    {
        this.info=info;
        this.nextNode= node;
    }
    @Override
    public String toString() {
        return String.valueOf(info);
    }
}
