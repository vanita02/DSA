
class Queue {

    int y;
    int r;
    int f;
    int n;
    int Q[];

    public Queue(int n) {
        this.n = n;
        this.r = 0;
        this.f = 0;
        Q = new int[n];
    }

    // ENQUEUE
    public void enqueue(int y) {

        if (r == n) {
            r = 1;
        } else {
            r++;
        }

        if (f == r) {
            System.out.println("overflow!!");
            return;
        }
        Q[r] = y;

        if (f == 0) {
            f = 1;

        }
    }

    // DEQUEUE
    public int dequeue() {
        if (f == 0) {
            System.out.println("underflow!!");
            return 0;
        }
        y = Q[f];

        if (f == r) {
            f = 0;
            r = 0;
            return y;
        }

        if (f == n) {
            f = 1;
        } else {
            f++;

        }
        return y;
    }

    public void print() {
        for (int i = f; i <= r; i++) {
            if (r != n) {
                System.out.print(Q[i] + " ");
            }
        }
    }
}

public class Lab9_51 {

    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.print();
        System.out.println();
        q.dequeue();
        q.print();
    }
}
