import java.util.Random;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		//방법 1
		//		//for(int num=1 ; num<=10; num++) {
		//		if(i<10) {
		//			if(i==0 || i ==2 || i=7) {
		//				cards[i]=new SutdaCard(i+1,true);
		//			}
		//			else{
		//				cards[i]=new SutdaCard(i+1,false);
		//			}
		//		}
		//		else {
		//			cards[i]=new SutdaCard(i-9,false);
		//		}
		//방법 2
		//cards[i]= new SutdaCard(i % 10 +1 , i ==0 || i==2 || i==7 ? true : false);
//내 방법		
		int index = 0;
		for(int num=1 ; num<=10; num++) {
			boolean isKwang = (num==1 || num ==3 || num==8);
			cards[index++]= new SutdaCard(num, isKwang);
			cards[index++]= new SutdaCard(num, false);
		}
	}
	void shuffle(){
		Random rand = new Random();
		for (int i=0; i<cards.length; i++) {
			int j = rand.nextInt(CARD_NUM);
			int temp=0;
			cards[temp] = cards[j];
			cards[j]=cards[i];
			cards[i]=cards[temp];
		}
	}
	// 셔플 다른 방법
//	void shuffle() {
//		for (int i=0; i<100; i++) {
//			int index = (int)(Math.random()*19)+1;
//			
//			SutdaCard temp = cards[0];
//			cards[0] = cards[index];
//			cards[index] = temp;
//		}
//	}
	
	SutdaCard pick(int index) { // 카드 하나 뽑아 반환할 것이기 때문에 리턴타입: SutdaCard
		return cards[index];
	}

	SutdaCard pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return cards[index];
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	//toString()
	//객체의 정보를 문자열로 반환하는 메소드
	//원래 Object 클래스에 정의된 메소드
	//Object 클래스는 자바의 모든 클래스의 부모 클래스
	//자바에서 상속받은 메소드는 자기 자신 클래스에 맞도록 재정의해서 사용할 수 있다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class SutdaTest {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
			//자바에서 객체가 "+" 연산되거나 print() 메소드의 인자로 지정되면
			//해당 객체의 toString()메소드가 자동으로 실행된다.
		}
		deck.shuffle();
		System.out.println();
		System.out.println(deck.pick());
		System.out.print(deck.pick(0));
	}

}
