package isc2024;

public class CardGame {
	
	int cards[];
	int cap;
	int top;
	
	public CardGame(int cc) {
		cards = new int[cc];
		cap = cc;
		top = -1;
		
	}
	
	public void addCard(int v) {
		
		if(top<cap-1) {
			cards[++top] = v;
		}else {
			System.out.println("CARD PILE IS FULL");
		}
		
	}
	
	
	int drawCard() {
		if(top<0) {
			return -9999;
		}else {
			int an = cards[top];
			top--;
			return an;
		}
	}

	public void display()
	{
		for(int i=0; i<=top; i++) {
			System.out.print(cards[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardGame obj = new CardGame(4);
		obj.addCard(2);
		obj.addCard(5);
		obj.addCard(10);
		obj.addCard(20);
//		obj.addCard(20);
		
//		obj.display();
		obj.drawCard();
		obj.display();
		obj.drawCard();
		obj.display();
		obj.drawCard();
		obj.display();
		obj.drawCard();
		obj.display();

		
	}

}
