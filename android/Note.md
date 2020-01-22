### Activity

- 화면에 표시되는 UI 구성을 위해 가장 기본이 되는 요소다.
- 어플리케이션은 여러 개의 Activity로 구성된다.
- Activity는 또 다른 Activity를 시작할 수 있다.
- 새로운 Activity가 시작되면 이전 Activitiy는 중단 되지만 `스택`에 보존하고 있다.
- LifeCycle 안드로이드 앱 참고

1. LifeCycle

![LifeCycle](../assets/activity_lifecycle.png)

- `전체 수명` : onCreate()와 onDestroy() 사이

  - onCreate에서 설정을 수행한 후에 나머지 리소스를 모두 onDestroy에서 해제해준다.

- `가시적 수명` : onStart()와 onStop() 사이

  - 사용자가 Activity와 상호작용 할 수 있는 시기다.

- `전경 수명` : onResume()과 onPause() 사이
  - 현재 Activity가 다른 Activity앞에 표시 되고, 사용자 입력도 집중된다.

2. Activity 상태 저장

- onSaveInstanceState()를 구현해 Activity상태에 관한 중요한 정보를 보존할 수 있다.
- Bundle로 저장된다.
- onCreate와 onRestoreInstanceState()에 전달된다.
- 이전 상태가 복구된다.

3. onCreate

- `Activity가 처음 생성되었을 때` 호출된다.
- `정적 설정을 모두 수행`해야 한다.
- `뒤에 항상 onStart()`가 호출된다.
- `setContentView(layout file)`를 이곳에서 호출해야 Activity의 사용자 인터페이스 레이아웃을 정의할 수 있다.

4. onStart

- Activity가 사용자에게 `화면을 보여줄 준비가 되었을 때` 호출된다.

5. onResume

- Activity가 시작되고 사용자와 `상호 작용하기 직전`에 호출된다.

6. Activity Running

- Activity가 사용자에게 화면을 보여줄 준비가 되었을 때 호출된다.
- `사용자가 Activity와 상호 작용이 가능`한 시기다.

7. onPause

- `화면이 일부 가려진 상태`
- 시스템이 다른 Activity를 재개하기 직전에 호출된다.
- 보통 데이터를 유지하기 위해서 `저장되지 않은 정보를 저장하는 용도로 사용`한다.
- 이 메소드가 반환이 될때까지 다음 Activity가 실행되지 않기 때문에 빠르게 종료시켜야 한다.
- `화면이 다시 보여지게 되면 onResume()`이 따라오고 `사라지게 되면 onStop()`이 따라온다.

8. onStop

- Activity가 `더 이상 사용자에게 보여지지 않는 상태`다.
- 사용자에게 다시 보여지게 되면 onRestart()가 따라오고 사라지게 되면 onDestroy()가 따라온다.

9. onDestroy

- `Activity가 소멸되기 직전`에 호출된다.
- Activity의 마지막 LifeCyle이다.
- 의도적으로 혹은 시스템 리소스를 절약하기 위해 종료 됐을수도 있다.

### Intent

- 어플리케이션 `구성 요소간에 작업 수행을 위한 정보 전달`을 하는 역할

- 종류

  - `명시적 Intent` : 작업을 수행하길 원하는 컴포넌트를 정확히 지목

  ```java
  // 현재 Activity에서 다음 Activity로 이동 (권장)
  Intent intent = new Intent(this, NextActivity);
  startActivity(intent);
  ```

  - `암시적 Intent` : 해당 작업을 할 수 있는 컴포넌트 전부에게 전달, Activity에서 사용하기 보단 공유버튼시 사용 ex) 인터넷 실행시 Chrome, Naver, Safari 등등..

  ```java
  Intent intent = new Intent(package.name.NextActivity);
  startActivity(intent);
  ```

- 사용 종류

  - WebView

  ```java
  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
  startActivity(intent);
  ```

  - Call

  ```java
  Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:01012341234"));
  startActivity(intent);
  ```

* Intent filter

  - 여러 Intent가 들어오는데 Intent filter를 통해 내가 원하는 Intent만 받아서 요청이 들어오는 작업을 진행
  - ex) 카카오앱은 카카오택시를 열수 있지만, 내가 만든 앱은 열 수 없다. 그 이유는 카카오택시가 Intent filter를 통해 카카오앱만 동작하게 막아놓기 때문이다.

* Intent data 전달

  - Intent에 data를 넣는 방법 (putExtra)

  ```java
  Intent intent = new Intent(this, NextActivity);
  Intent.putExtra(KEY, VALUE);
  ```

  - Intent에서 data를 꺼내는 방법 (getIntent)

  ```java
  Intent intent = getIntent();
  String data = intent.getString(KEY);
  ```

* Intent의 결과값 받기 : Intent로 새로 생성된 Activity로 부터 응답 받기

```java
// 상황 : Activity A에서 Activity B로 작업 요청하고 Activity A는 요청된 작업의 결과값을 받고 싶다.

// Activity A
Intent intent = new Intent(this, NextActivity);
startActivityForResult(intent, REQUEST_CODE);

// Activity B
Intent intent = new Intent();
intent.putExtra(KEY, VALUE);
setResult(RESULT_CODE, intent)

// Activity A
@Override
Protect void onActivityResult(int requestCode, int resultCode, Intent data){
    if(requestCode = REQUEST_CODE){
        String result = intent.getString(KEY)
    }
}
```
