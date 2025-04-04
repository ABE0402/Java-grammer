	class MyTv2{
	    int channel; //현재 채널을 저장하는 메소드
		int prevChannel;	
		
		public int getChannel() {
			return channel;
		}
		
		//현재 채널 : 10
		//다시 변경할 채널 : 20
		//현재 채널에서 다른 채널로 채널값을 변경할때 이전채널이 생긴다.
		
		//인자로 전달되는 값을 channel 속성값으로 할당하는 메소드
		public void setChannel(int i) {
			prevChannel = this.channel;
			this.channel = i; //현재 채널 값을 인자로 전달된 값으로 변경
		}
		
		public void gotoPrevChannel() {
			//setChannel(prevChannel); 이 방법이 더 간단하다. ***
			int temp = channel; 
			channel =prevChannel;
			prevChannel = temp;
		}
		
	}
	
	
	public class Exercise {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyTv2 t = new MyTv2();
			t.setChannel(10);
			System.out.println("CH:" +t.getChannel());
			t.setChannel(20);
			System.out.println("CH:" +t.getChannel());
			t.gotoPrevChannel();
			System.out.println("CH:" +t.getChannel());
			t.gotoPrevChannel();
			System.out.println("CH:" +t.getChannel());
	
		}
	
	}