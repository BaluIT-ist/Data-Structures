import java.util.Objects;

public class Node {

    int info;
    Node nextNode= null;

    public Node(int info,Node node)
    {
        this.info=info;
        this.nextNode=node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return info == node.info && Objects.equals(nextNode, node.nextNode);
    }

}
