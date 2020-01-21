# Java basic

### 01. 자바 (Java)

Java란?

- `객체지향 언어` : 어떠한 큰 문제를 작은 덩어리로 나누고 그 덩어리들을 해결할 수 있는 객체를 만들어 전체를 해결하는 방식
- 안드로이드가 개발언어로 자바를 사용한다는건 우리가 앱을 만들 때 각각의 기능들을 담당하는 객체들을 만들고 이들을 조합하므로써 앱을 만든다는 의미다.

### 02. 변수 (Variable)

- 변수는 이름 그대로 변하는 수를 의미한다.
- 변수를 변수 안에 값을 넣어 놓기 위해서 사용한다.
- 변수명 제약 조건

  - &, \$와 같은 특수문자를 사용할 수 없다.
  - 이미 지정되어 잇는 변수명(자바 키워드)은 사용할 수 없다.
  - ex) int, class, long

- 변수 선언 방법

```java
// 자료형 변수명
int number;
double number2;
```

- 변수에 값을 대입하는 방법

```java
// 자료형 변수명
int a;
String b;

a = 10; // a는 int형태만 와야 한다.
b = “Variable” // b는 string형태만 와야 한다.
```

### 03. 자료형 (Type)

1. Primitive Type

- 어떤 언어, OS에서도 같은 뜻으로 통한다.
- 소문자로 시작한다.

(1) 양수 : short / int / Long (자리수 차이)
(2) 음수 : float / double (자리수 차이)
(3) 참/거짓 : boolean
(4) 문자 : Char

2. Reference Type

- 어떤 언어별, OS별로 뜻이 다르거나 혹은 존재하지 않음으로 설명이 필요하다.
- 대문자로 시작한다.

(1) 이미 있는 타입 : String / View
(2) 사용자 정의 타입 : Student / Teacher

### 04. 메소드 (Method)

- 독자적으로 존재할 수 있으면 함수, 없으면 메소드라 한다.
- 자바에선 클래스에 의존해서 사용하기 때문에 메소드라 한다.

```java
/*
반환형이 있는 함수 구조
접근제어자 반환형 메소드명 입력값{
    메소드 내용
}
*/
public int sum (int a, int b){
    int result
    result = a+b
    return result
}

/*
반환형이 없는 함수 구조
접근제어자 void 메소드명 입력값{
    메소드 내용
}
*/
public void sum (int a, int b){
    int result
    result = a+b
    return result
}
```

- 메소드 호출 방법

  - 함수가 입력값을 받는 경우 ex) sum(10, 20)
  - 함수가 입력값을 받지 않는 경우 ex) sum()

- 메소드를 사용하는 이유

  - 똑같은 로직의 반복을 피할 수 있다.
  - 가독성이 좋아진다.

### 05. 연산자

1. 산술 연산자 : +(더하기) -(빼기) \*(곱하기) /(나누기) %(나머지)
2. 대입 연산자 : 좌변 = 우변
3. 복합 대입 연산자 : +=(더한 후 대입), -=(뺀 후 대입), \*=(곱한 후 대입), /=(나눈 후 대입), %=(나머지를 구한 후 대입)
4. 증감 연산자 : ++(1을 더한다), --(1을 뺀다)
5. 비교 연산자 : > , >=, <, <=, ==, !=
6. 논리 연산자 : &&(and), ||(or), !(not)

### 06. 제어문

1. if문 : 조건의 결과는 반드시 `true 또는 false`이어야 한다

```java
if (조건){
    실행문
} if else(조건){
    실행문
} else {
    실행문
}
```

2. Switch문 : 조건의 결과는 반드시 `상수`이어야 한다.

```java
switch (조건){
    Case1: 실행문, break
    Case2: 실행문, break
    Default: 실행문, break
}
```

### 07. 제어문2

1. while문 : 특정 `조건이 만족하는 동안`, 특정 코드를 반복 실행시킨다.

```java
while (배가 고프다 == true){
    돈까스를 한입 먹는다
    돈까스를 한입 먹는다
    돈까스를 한입 먹는다
    break
    continue
}
```

2. for문 : 특정 `횟수에 도달할 때까지`, 특정 코드를 반복 실행시킨다.

```java
for (int j=0; j<10; j++){
    돈까스를 한입 먹는다
}
```

### 08. 배열

- `동일한 자료형`의 집합을 표현하기 위한 자료형이다.
- 배열의 `크기는 변경할 수 없다.`
- 배열의 첫번째 index는 0이다.

- 배열 만드는 방법

```java
// 명시적으로 크기를 표현하는 방법 (비어있는 공간만 생성)
int[] intGroup = new int[3]

// 배열의 인수로 크기를 표현하는 방법 (공간에 인수도 들어감)
int[] intGroup = {1, 2, 3}
```

```java
// 배열에 값을 넣는 방법 : intGroup[] = 값
intGroup[2] = 3

// 배열에 값을 얻는 방법 : int 변수 = intGroup[값]
int third = intGroup[1]
```

### 09. 리스트 (List)

- 배열은 크기가 불편하지만 (고정), 리스트의 크기는 동적이다.

- ArrayList

```java
// 생성법1 : ArrayList에 들어갈 자료를 명시적으로 표현
ArrayList <자료형> 변수명 = new ArrayList <자료형>();

// 생성법2 : ArrayList에 들어갈 자료형을 생략
ArrayList 변수명 = new ArrayList();

// 값 추가하는 방법 : .add()
ArrayList testList = new ArrayList();
testList.add(값);

// 값을 제거하는 방법 : .remove()
testList.remove(값);

// 값을 가져오는 방법 : .get(index)
testList.get(index)
```

### 10. 클래스 (Class)

- 클래스를 통해 객체를 만든다.
- 생성자
  - 클래스 이름과 동일한 함수명을 갖고 있는 함수를 생성자라고 한다.
  - 생성자는 복수개 일 수 있으나, 반드시 인자로 받는 파라미터가 달라야 한다.

```java
// 인스턴스화 방법 : 클래스명 변수명 = new 생성자();
Car myCar = new Car();

// 클래스 기능 사용 방법;
myCar.run()
```

### 11. 상속 (extends)

- 클래스를 사용할때 발생할 수 있는 불편함을 해소하기 위해 만들어졌다.
- 많은 클래스에서 공통적인 기능이 있다면 `공통으로 사용하는 클래스를 만들고` 상속받는 형태로 구성하는게 중복을 줄일 수 있다.
- 이때 `공통 기능`을 수행하는 클래스를 `부모 클래스`, `상속 받는 클래스`를 `자식 클래스`라 한다.
- 만약에 공통 기능에서 세부 내용을 변경하고 싶으면 `override`를 통해 수정할 수 있다.
- 즉, override는 부모가 가지고 있는 기능을 수정해서 사용할 수 있도록 해준다.
- overload는 함수가 작동하는데 필요한 파라미터를 바꿔주는 역할을 한다.
- 자바에서는 다중 상속이 불가능하다.

### 12. 인터페이스 (Interface)

- ~라면 반드시 ~기능이 있어야 한다.
- 공통적으로 쓰이는 함수지만 `상속받는 클래스별로 override가 필요할 때` 사용한다.
- 함수를 명시적으로 표현하고 상속받는 클래스에서 직접 함수를 구현한다.
- 인터페이스를 구현하는 클래스에게 인터페이스가 가지고 있는 함수의 구현을 강제할 수 있다.

```java
// 공통 클래스의 인터페이스
Interface Human{
    public void eat();
}

// 상속받는 클랫스1
class Father implements Human{
    public void eat(){
        "많이 먹는다"
    }
}

// 상속받는 클랫스2
class Mother implements Human{
    public void eat(){
        "적게 먹는다"
    }
}

// 상속받는 클랫스3
class Son implements Human{
    public void eat(){
        "매우 많이 먹는다"
    }
}
```

- 인터페이스는 협업에 용이하다

```java
// 정의해야할 기능을 미리 인터페이스로 정의
Interface Father{
    public void eat();
    public void sleep();
    public void wash();
}
```

### 13. 접근제어자

- 해당 부분의 접근을 어디까지 허용 할지 정하는 키워드

1. `private` : 해당 클래스 안에서만 접근이 가능하다.
2. `default` : 해당 패키지 내에서만 접근이 가능하다.
3. `protected` : 해당 패키지 내부와, 상속받은 클래스까지 허용
4. `public` : 어떤 클래스에서든지 접근이 가능하다.

=> 안드로이드에서 생성하는 일반적인 클래스와 인터페이스는 모두다 같은 패키지에 있기 때문에 default와 protected는 사용성이 낮은 편이다.

- static : 어떤 곳에서도 접근이 가능하다.

### 14. 제너릭 (Generic)

- 인스턴스를 생성할 때 인스턴스에서 사용될 데이터의 타입을 정해준다.
- 타입의 안정성을 높여주고 형변환을 해야하는 번거로움을 줄일 수 있다.

```java
// 제너릭을 사용하지 않는 경우
ArrayList arrayList = new ArrayList();
arrayList.add("fast");
String data = (String)arrayList.get(0);

// 제너릭을 사용하는 경우
ArrayList arrayList = new ArrayList<String>();
arrayList.add("fast");
String data = arrayList.get(0);
```
