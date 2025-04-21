-- 테이블 : 데이터베이스에 데이터를 저장하는 논리적인 단위
CREATE TABLE member(
	-- 클래스의 속성이 컬럼이 됨
	-- int id;
	id NUMBER PRIMARY KEY, --UNIQUE + NOT NULL
	name VARCHAR2(15) NOT NULL,
	gender CHAR(1) NOT NULL,
	birthday DATE
)

DROP TABLE member PURGE;

CREATE TABLE member(
	-- 클래스의 속성이 컬럼이 됨
	-- int id;
	id NUMBER PRIMARY KEY, --UNIQUE + NOT NULL
	name VARCHAR2(15) NOT NULL,
	gender CHAR(1) NOT NULL,
	age NUMBER,
	birthday DATE
)


INSERT INTO member VALUES(member_seq.nextval,'홍길동','M',21,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'최민수','F',37,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'홍두깨','F',32,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'이만수','M',25,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'김민수','F',37,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'오두깨','F',32,'2020-09-09');
INSERT INTO member VALUES(member_seq.nextval,'박만수','M',25,'2020-09-09');


-- 테이블에 있는 모든 컬럼의 값을 조회
SELECT *
FROM member;

SELECT id, name , age, age * 2
FROM member;

-- 조회할때 heading 값을 변
SELECT id, name , age, age * 2 AS doubleAge
FROM member;

-- function을 사용해도 컬럼 이름이 변경된다.
-- Heading 값을 변경할때 AS를 생략할 수 있다.
SELECT count(id) idCount FROM member;

-- 오라클에서 문자열 연결자 : || 
SELECT '아이디 - ' + id , '이름 - ' + name
FROM member;

-- WHERE : 조건에 맞는 레코드만 조회를 하는 기능
SELECT * FROM MEMBER
WHERE age >= 20 AND age <= 30;


-- > , <, >=, <=
-- <>
SELECT * FROM MEMBER
WHERE gender <> 'M';

-- RANGE Search
-- between ~ and ~
-- 조건값 포함됨
SELECT * FROM MEMBER
WHERE age BETWEEN 20 AND 30;

-- AND : 두 조건 모두 만족해야 조건을 만족하는 연산자
-- OR : 두 조건 중 하나 이상 만족하면 조건을 만족하는 연산자
SELECT * FROM MEMBER
WHERE age >= 20 OR age <= 30;

-- 리스트 연산자
-- IN(조건값1, 조건값2...);
-- 컬럼의 값이 ()안에 나열된 값 중 하나와 같으면 조건을 만족
SELECT * FROM MEMBER
WHERE name IN ('홍길동','최민수','홍두깨')

-- LIKE : 패턴문자에 맞는 패턴의 문자열로 비교
-- LIKE '패턴문자'
--_ : 임의의 한문자
--% : 문자가 하나도 없거나 어떤 문자가 몇개가 와도 되는 패턴문자

SELECT * FROM MEMBER
WHERE name LIKE '홍_동';
SELECT * FROM MEMBER
WHERE name LIKE '_길동';
SELECT * FROM MEMBER
WHERE name LIKE '홍%';

-- 이름에 만% 문자열이 포함된 회원의 정보 조회
SELECT * FROM MEMBER
WHERE name LIKE '%만%';

-- 패턴 문자를 일반문자로 인식시키려면 이스케이프 문자를 사용해야 한다.
SELECT * FROM MEMBER
WHERE name LIKE '%만\%%' ESCAPE '\';

-- 정렬
-- ORDER BY 컬럼명 (ASC | DESC)
-- 기본이 오름차순으로 정렬되므로 오름차순으로 정렬할때는 ASC 생략 가능함
SELECT * FROM MEMBER
ORDER BY age;

SELECT * FROM MEMBER
ORDER BY age DESC;

-- 나이로 내림차순 정렬을 하고, 아이디로 2차 정렬 - 오름차순
SELECT * FROM MEMBER
ORDER BY age DESC, id DESC;

-- NULL 값 비교
-- NULL : 해당 컬럼에 값이 없는 것을 의미
-- 컬럼에 NOT NULL 속성이 지정되어 있으면 NULL 값을 허용하지 않고
-- NOT NULL 속성이 지정되지 않은 컬럼들은 NULL 값을 허용한다. 즉, INSERT 할때 
-- NOT NULL 속성이 지정되지 않은 컬럼에는 값을 삽입하지 않아도 된다.
INSERT INTO member(id, name, gender) VALUES(member_seq.nextval,'오정원','F');
SELECT * FROM member;

-- NULL 값은 값이 없는 것이기 때문에 비교연산자로 NULL 값을 비교할 수 없다. 
-- 값이 NULL인지 아닌지 판단할때는 IS 나 IS NOT 를 사용해야 함
SELECT * FROM member
WHERE birthday IS NOT NULL;










