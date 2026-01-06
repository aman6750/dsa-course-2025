package ISC;

public class CirQueue {
	
	int Q[];
	int cap;
	int front;
	int rear;
	
	
	public CirQueue(int n) {
		cap = n;
		Q = new int[cap];
		front = 0;
		rear = 0;
	}
	
	public void push(int v) {
		if((rear+1)%cap==front) {
			System.out.println("QUEUE IS FULL");
		}else {
			Q[rear] = v;
			rear = (rear+1)%cap;
		}
	}
	
	public int remove() {
		if(front==rear) {
			return -999;
		}else {
			int val = Q[front];
			front = (front+1)%cap;
			return val;
		}
	}
	
	public void print() {
		if(front==rear) {
			System.out.println("QUEUE IS EMPTY");
			return;
		}
		
		int i = front;
		while(i!=rear) {
			System.out.print(Q[i]+" ");
			i=(i+1)%cap;
		}
		
		System.out.println();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CirQueue cq = new CirQueue(5);
		cq.push(10);
		cq.push(20);
		cq.push(30);
		cq.push(40);
		
		cq.print();
		
		System.out.println("Removed: " + cq.remove());
        System.out.println("Removed: " + cq.remove());
        
        cq.print();
        
        cq.push(50);
        cq.push(60);

        System.out.print("Final Queue: ");
        cq.print();
		
	}

}
