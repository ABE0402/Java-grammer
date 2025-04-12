//throws : 원래 예외는 예외가 발생한 메소드 내에서 처리를 하면 된다.
//그렇지만, 예외가 발생하는 모든 메소드 안에 try -catch 구문을 작성하면 코드가 복잡해진다.

public class ExceptionTest4 {
	
	public void exceptionMethod() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest4 exceptionTest4 = new ExceptionTest4();
		try {
			exceptionTest4.exceptionMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
