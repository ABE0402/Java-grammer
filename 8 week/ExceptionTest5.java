//요구사항
//프로그램을 실행할때 인자를 전달 받는다.
//인자가 두개가 아니면 사용자정의 예외를 발생시킨다.
//그리고 아래와 같은 메시지를 출력한다.
//인자를 두 개 입력해야 합니다.
//당신이 입력한 인자는 1개입니다.

class ArgsException extends Exception{
	
	public ArgsException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	private int argsNumber;
	
	
	public int getArgsNumber() {
		return argsNumber;
	}
	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
}

public class ExceptionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length != 2) {
				ArgsException ae = new ArgsException("인자를 두 개 입력해야 합니다.");
				ae.setArgsNumber(args.length );
				throw ae;
			}
			else {
				int number1 = Integer.getInteger(args[0]);
				int number2 = Integer.getInteger(args[1]);
				
				System.out.println(number1 + " + " + number2 + " = " + (number1 +number2));
			}
		} catch (ArgsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("당신의 입력한 인자 수는 "+ e.getArgsNumber() + "개 입니다.");
		}
	}

}
