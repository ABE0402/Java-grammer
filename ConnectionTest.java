// 자바에서 DB 작업
// 1. DBMS에서 제공하는 드라이버 클래스를 프로그램에서 인식할 수 있는 경로에 복사 붙여넣기

// 2. 프로그램에서 드라이버 클래스를 로딩해야함.
// 3. Connection 객체 생성
// Connection 객체 : 데이터베이스에 연결하는 객체
// 이 객체가 제대로 생성되면 데이터베이스 연결에 성공한 것임
// 4. Statement 객체 생성
// Statement 객체 : SQL 구문을 실행하는 역할
// 주요메서드
// int executeUpdate(String sql)
// SELECT 구문을 제외한 DML문장(UPDATE, DELETE, INSERT ...)을 실행
// 적용된 레코드 개수가 반환

// ResultSet executeQuery(String sql)
// SELECT 구문을 실행
// 조회된 레코드셋(레코드덩어리)을 ResultSet 타입으로 반환

// ResultSet의 메소드
// boolean next()
// 다음 레코드로 작업할 레코드 위치를 이동
// 다음 레코드가 있으면 true 반환
// T getT(int columnNumber) : 현재 가리키고 있는 레코드의 인자로 지정된 위치의 컬럼값을 반환
// 컬럼위치는 1부터 시작됨
// rs.getString(2) : name 값 반환
// T getT(String columnName) : 인자로 지정된 이름을 가진 컬럼의 값을 반환
// rs.getString("name")

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConnectionTest {

	Connection con;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void connect() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18.71:1521:XE", 
					"java1", 
					"java1");
			System.out.println("connection success!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert(int id, String name, String gender, String birthday) {
		// C(Create)
		// INSERT 구문
		// 1. INSERT INTO 테이블명
		// VALUES(삽입할데이터1,삽입할데이터2,삽입할데이터3,삽입할데이터4....)
		// 테이블에 정의된 컬럼의 개수와 VALUES 절에 나열된 데이터의 개수가 일치해야 함
		Statement stmt = null;
		// INSERT 구문
		// 1. INSERT INTO 테이블명
		// VALUES(삽입할데이터1, 삽입할데이터2, 삽입할데이터3....)
		// 테이블에 정의된 컬럼이 개수와 VALUES 절에 나열된 데이터의 개수가 일치해야 함
		// String sql = "INSERT INTO member VALUES(" 
		//   + id + ",'"+ name + "' ,'" + gender + "','"+ birthday + "')";

		// 2.
		// INSERT INTO 테이블명
		// VALUES(컬럼명1에 삽입할 데이터, 컬럼명2에 삽입할 데이터,...)
		// 데이터를 삽입할 칼럼을 지정해서 INSERT 하는 방법
		// 테이블 뒤에 나열한 컬럼의 개수와 VALUES 절에 나열한 데이터의 개수가 동일해야함
		// NOT NULL 속성이 있는 컬럼은 반드시 데이터를 삽입해야 한다.
		// 즉 테이블명 뒤에 해당 컬럼명을 생략할 수 없다.      
		String sql = "INSERT INTO member(id, name, gender, birthday) VALUES(" +
				id + ",'"+ name + "' ,'" + gender + "','"+ birthday + "')";


		try {
			connect();
			stmt = con.createStatement();
			int insertCount = stmt.executeUpdate(sql);

			if(insertCount > 0) {
				System.out.println("insert success!!");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void selectAll() {
		Statement stmt = null;
		ResultSet rs = null;

		// SELECT 구문
		// SELECT select_list (column_list | subquery | function...)
		// FROM (테이블 | 뷰 | subquery...)

		String sql = "SELECT * FROM member";

		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getInt(1) + ", 이름 : " + 
						rs.getString("name") + ", 성별 : " + rs.getString("gender") + ", 날짜 : " + 
						rs.getString("birthday"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	// 특정 성씨의 회원정보 조회
	public void selectByFirstName(String firstName) {
		Statement stmt = null;
		ResultSet rs = null;

		// SELECT 구문
		// SELECT select_list (column_list | subquery | function...)
		// FROM (테이블 | 뷰 | subquery...)

		String sql = "SELECT * FROM member WHERE name LIKE '" + firstName + "%'";

		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getInt(1) + ", 이름 : " + 
						rs.getString("name") + ", 성별 : " + rs.getString("gender") + ", 날짜 : " + 
						rs.getString("birthday"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	// U(Update)
	// java 에서 update 작업을 하는 방법은 insert 작업을 하는 방법과 유사 
	public void update(int id, String name, String gender, int age, String birthday) {
		Statement stmt = null;

		// UPDATE
		// UPDATE 테이블명
		// SET 컬럼명1 = 변경할 값, 컬럼명2 = 변경할값,....
		// WHERE 조건 (SELECTION : 레코드를 필터링)

		String sql = "UPDATE member "
				+ "SET name = '" + name + "',"
				+ "gender = '" + gender + "',"
				+ "birthday = '" + birthday + "',"
				+ "age = " + age + " WHERE id = " + id;

		try {
			connect();
			stmt = con.createStatement();
			int updateCount = stmt.executeUpdate(sql);

			if(updateCount > 0) {
				System.out.println("update success!!");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void delete(int id) {
		Statement stmt = null;

		// DELETE
		// DELETE (from) 테이블명
		// WHERE 조건 (SELECTION : 레코드를 필터링)
		String sql = "DELETE member "
				+ " WHERE id = " + id;

		try {
			connect();
			stmt = con.createStatement();
			int deleteCount = stmt.executeUpdate(sql);

			if(deleteCount > 0) {
				System.out.println("delete success!!");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		ConnectionTest connectionTest = new ConnectionTest();
		// connectionTest.connect();
		// connectionTest.insert(4, "이수연", "F", "2001-06-27");
		System.out.println("전체 데이터 조회");
		connectionTest.selectAll();
		System.out.println("홍씨 회원 정보 조회");
		connectionTest.selectByFirstName("홍");
		System.out.println("수정 처리 후 데이터");
		connectionTest.update(3, "오수정", "F", 40, "1985-08-06");
		connectionTest.selectAll();
		System.out.println("id가 3인 데이터 삭제 후 데이터");
		connectionTest.delete(3);
		connectionTest.selectAll();
	}

}
