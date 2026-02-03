package ISC;

public class DequeProblem {
	
	int ele[];
	int cap;
	int front;
	int rear;
	
	
	public DequeProblem(int max) {
		cap = max;
		front = 0;
		rear = 0;
		ele = new int[cap];		
	}
	
	public void pushFront(int v) {
		if(front ==0) {
			System.out.println("full from front");
		}else {
			front--;
			ele[front] = v; 
		}
	}
	
	public int popFront() {
		if(front==rear) {
			return -999;
		}else {
			int bag = ele[front];
			front++;
			return bag;			
		}
	}
	
	public void pushRear(int v) {
		if(rear==cap) {
			System.out.println("full from rear");
		}else {
			ele[rear] = v;
			rear++;
		}
	}
	
	public int popRear() {
		if(rear==front) {
			return -999;
		}else {
			rear--;
			return ele[rear];
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DequeProblem obj = new DequeProblem(5);
		
		obj.pushRear(10);
		obj.pushRear(20);
		obj.pushRear(30);
		
//		obj.pushFront(5);
		
		System.out.println("Removed from front: " + obj.popFront());
        System.out.println("Removed from rear: " + obj.popRear());

		
		
		
	}

}
