### 01. 개요

1. 화면 구성 도구 

- XML
  - 안드로이드에서 `View를 그리는데 사용되는 언어`
  - DSL (Domain Specific Language) : 어떠한 특정 작업을 하는데 있어서 특화된 언어
  
- View Component
  - 안드로이드 화면을 구성하는 요소들
  - TextView, ImageView, Button, ...


2. View Component

- 부모(Parent)가 될 수 있는 View Component
  - LinerLayout
  - RelativeLayout
  - FrameLayout
  - ScrollView
  - 기타 등등

- 자식(Child)가 될 수 있는 View Component
  - TextView, ImageView
  - 기타 등등 모든 View Component


3. 속성 (Attribute)

- 모든 View Component가 가지고 있는 속성
  - Width
  - Height
  - Background

- 각각의 View Component가 가지고 있는 속성
  - Ex) TextView의 TextColor, TextSize


4. 화면 크기 단위

- `px` : ViewComponent의 절대 크기를 나타낼 때
- `dp` : device 화면대비 동일한 크기 (비율)
  
: 가능한 dp를 사용해야 다양한 디바이스를 커버할 수 있음


### 02. 크기

1. View의 크기를 지정하는 방법

- 숫자로 지정하는 방법 (dp)
- `WrapContent` : 컴포넌트의 내용물로 크기를 설정
- `MatchParent` : 부모의 크기만큼 설정

2. View의 여백을 지정하는 방법

- `Margin` : 자식 View를 부모 View로부터 얼마나 떨어뜨릴지 설정
- `Padding` : 내용물의 위치를 설정


### 03. Linearyout

부모 View 컴포넌트는 자식 View 컴포넌트의 위치를 담당

주요 속성

- `Orientation` : 자식 View들의 수직/수평 배치를 설정 (Horizontal, vertical)
- `Weight` : 자식 View들의 크기를 가중치로 결정 (number)
- `Gravity` : 치우침으로 이해하는게 편함, 즉 자식 View를 부모의 어떤 방향으로 치우치게 배치할지 정하는 방법 (Top, Center, Bottom)


### 04. Relativelayout

부모 View 컴포넌트는 자식 View 컴포넌트의 위치를 담당

주요 속성

- `alignParent~` : relativelayout 자체를 기준으로 사용하여 자식뷰를 배치하는 방법
- 기준을 지정하여 지정한 기준을 중심으로 다른 자식뷰들의 배치를 조정하는 방법 (Left, Right, Above, Below)


### 05. FrameLayout

뷰 컴포넌트들을 `겹쳐 보이고 싶을 때` 사용

주요 속성

- `Gravity` 속성을 활용할 수 있음
- left, center_horizontal, right, top, bottom


### 06. ScrollView

내가 지정한 뷰의 영역보다 내용물이 많은 경우 활용

- `오직 하나의 자식 뷰`만을 가질 수 있다.
- 스크롤 뷰의 자식이 다른 여러 자식 뷰들을 갖는 것은 상관 없다.

주요 속성

- `fillViewport` : match_parent (True/False)
- `scrollbars` (None, Vertical, Horizontal)