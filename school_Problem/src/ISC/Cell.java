package ISC;

public class Cell {
	
	char m;
	Cell right;
	
	public void lowercase(Cell str) {
		int sum = 0;
		Cell temp = str;
		while(temp!=null) {
			if(temp.m>='a' && temp.m<='z') {
				sum += (int)temp.m;
			}
			
			temp = temp.right;
		}
		
		System.out.println("Sum of ASCII Value ="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cell n1 = new Cell();
			n1.m = 'a';
			
			Cell n2 = new Cell();
			n2.m = 'b';
			
			Cell n3 = new Cell();
			n3.m = 'C';
			
			Cell n4 = new Cell();
			n4.m = 'd';
			
			n1.right = n2;
			n2.right = n3;
			n3.right = n4;
			n4.right = null;
			
			
			Cell obj = new Cell();
			obj.lowercase(n1);
	}

}
