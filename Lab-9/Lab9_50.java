
class Queue {

    int y;
    int r;
    int f;
    int n;
    int Q[];

    public Queue(int n) {
        this.n = n;
        this.r = -1;
        this.f = -1;
        Q = new int[n];
    }
    // ENQUEUE
    public void enqueue(int y) {
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
    // DEQUEUE
    public int dequeue() {
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

    public void print() {
        for (int i=f; i<=r; i++) {
            if (r != n) {
                System.out.print(Q[i] + " ");
            }
        }
    }
}

public class Lab9_50 {

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.print();
        System.out.println();
        q.dequeue();
        q.print();
    }

}
