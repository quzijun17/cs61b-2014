package list;

/**
 * Created by ZijunQu on 16/6/29.
 */
public class LockDList extends DList {


    protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
        return new LockDListNode(item, prev, next);
    }

    public void lockNode(DListNode node) {
        ((LockDListNode) node).isLocked = true;
    }

    public void remove(DListNode node) {
        // Your solution here.
        if (((LockDListNode) node).isLocked == false) {
            super.remove(node);
        }
    }
}
