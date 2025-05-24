
public class Lab9_52 {

    int y;
    int r;
    int f;
    int n;
    int Q[];

    public Lab9_52(int n) {
        this.n = n;
        this.r = 0;
        this.f = 0;
        Q = new int[n];
    }
    
    // INSERT AT FRONT
    public void dqInsert_front(int y) {
        if (f == 1) {
            System.out.println("overflow!!");
            return;
        }
        if (f == 0) {
            f = 1;
            r = 1;
        } else {
            f--;
        }
        Q[f] = y;
        return;
    }

    // INSERT AT REAR
    public void insertAtRear(int y) {
        if (r >= n) {
            System.out.println("overflow!!");
            return;
        }
        r++;
        Q[r] = y;

        if (f == -1) {
            f = 0;

        }
    }

    // DELETE AT FRONT
    public int deleteAtFront() {
        if (f == -1) {
            System.out.println("underflow!!");
            return 0;
        } else {
            y = Q[f];
        }
        if (f == r) {
            f = 0;
            r = 0;
        } else {
            f++;
        }
        return y;
    }

    // DELETE AT REAR
    public int dqDeleteRear() {
        if (r == 0) {
            System.out.println("underflow!!");
            return 0;
        }
        y = Q[r];

        if (r == f) {
            r = 0;
            f = 0;
        } else {
            r--;
        }
        return y;
    }

    public void print() {
        for (int i = f; i <= r; i++) {
            System.out.print(Q[i] + " ");
        }
    }

    public static void main(String[] args) {
        Lab9_52 dq = new Lab9_52(5);
        dq.dqInsert_front(10);
        // dq.dqInsert_front(20);
        // dq.dqInsert_front(30);
        // dq.dqInsert_front(40);
        // dq.dqInsert_front(50);
        dq.print();
        System.out.println();
        dq.insertAtRear(60);
        dq.insertAtRear(70);
        dq.insertAtRear(80);
        dq.print();
        System.out.println();
        dq.deleteAtFront();
        dq.print();
        System.out.println();
        dq.dqDeleteRear();
        dq.print();
    }
}
