package list;

/**
 * Created by ZijunQu on 16/6/29.
 */
public class LockDListNode extends DListNode {
    protected boolean isLocked;
    LockDListNode(Object i, DListNode p, DListNode n) {
        super(i,p,n);
        isLocked = false;
    }
}
