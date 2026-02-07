package ISC;

public class UndoStack {
	
	String actions[];
	int top;
	int capacity;
	
	public UndoStack(int c) {
		capacity = c;
		top = 0;
		actions = new String[c];
	}
	
	public void record(String cmd) {
		if(top==capacity-1) {
			System.out.println("History Full");
		}else {
			
			actions[top] = cmd;
			top++;
		}
	}
	
	public String undo() {
		if(top ==0) {
			return "NO ACTION";
		}		
			
		top--;
			String s = actions[top];
			
			return s;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndoStack obj = new UndoStack(4);
		obj.record("aman");
		obj.record("preeti");
		obj.record("srishti");
		
		System.out.println(obj.undo());
	}

}
