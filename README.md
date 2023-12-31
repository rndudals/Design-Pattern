## 요구사항
리포트 생성기를 만들려한다. 리포트는 앞 표지와 본문 그리고 뒤표지로 구성되며 앞표지를 제외한 모든 페이지에는 머리말과 꼬리말이 찍힌다. 머리말과 꼬리말을 여러가지 형태로 제공될 수 있으며 후에 추가될 수 있다. 앞표지와 뒤표지 역시 다양하게 제공될 수 있어야하며 후에 추가될 수 있어야한다. 꼬리말에는 출력 일과 리포트 제목이 독립적으로 선택, 추가될 수 있다. 리포트 종류에 따라 머리말과 꼬리말 조합이 달라지는데 리포트 종류를 정의할 수 있어야한다. 리포트 생성비용은 앞표지와 뒤표지, 머리말과 꼬리말 별로 가격이 정해져 있어 이들 가격의 조합으로 가격을 결정한다. 가격결정 방법에 따라 모든 가격이 더해질수도 있고 가중치에 따라 정상가격에서 앞표지와 뒤표지, 머리말과 꼬리말 별로 할인 비율을 적용할 수도 있다. 리포트 생성기에 제공되는 정보는 리포트 제목, 리포트 본문, 리포트 작성자, 작성자의 연락처가 제공된다.

## 적용될 디자인패턴
1. strategy pattern <br/>
리포트의 종류에 따라 머리말과 꼬리말이 달라지기 때문에, 이러한 유형의 변화에 대응
하기 위해 strategy pattern을 사용합니다. 각 리포트 종류에 따라 다른 전략을 선택함으
로써 머리말과 꼬리말의 다르게 구성할 수 있습니다.

2. Factory pattern <br/>
리포트 생성기에서 앞 표지와 뒷 표지는 다양한 형태로 제공될 수 있고, 추가될 수 있
어야 합니다. 이런 유형의 객체를 생성하는데 팩토리 패턴을 사용함으로써 객체 생성의
유연성과 확장성을 보장할 수 있습니다. 새로운 종류의 표지가 추가되더라도 코드 변경
없이 쉽게 처리할 수 있습니다.

3. Decorator pattern  
꼬리말에 출력 일과 리포트 제목이 독립적으로 선택되고 추가될 수 있습니다. 데코레이
터 패턴은 객체에 동적으로 새로운 책임을 추가할 수 있게 해줍니다. 출력 일과 리포트
제목과 같은 선택적인 부분을 쉽게 확장하고 조합할 수 있도록 합니다




### strategy pattern

<img width="534" alt="스크린샷 2023-12-29 155357" src="https://github.com/rndudals/Design-Pattern/assets/102203336/598771b8-24c3-4331-aa09-4f4b68de80d1">

### Factory pattern
<img width="544" alt="스크린샷 2023-12-29 155414" src="https://github.com/rndudals/Design-Pattern/assets/102203336/ed72b8b5-76f5-48f2-bdcd-5c69ab4c355b">

### Decorator pattern
<img width="549" alt="스크린샷 2023-12-29 155428" src="https://github.com/rndudals/Design-Pattern/assets/102203336/a31e96c8-6d68-497e-a1a7-8edc2fca46d6">

## 전체 클래스 다이어그램
<img width="600" alt="스크린샷 2023-12-29 155451" src="https://github.com/rndudals/Design-Pattern/assets/102203336/6868abe2-9636-488f-b268-a2d478cbf93a">

## 사용 예시
<img width="751" alt="스크린샷 2023-12-29 160543" src="https://github.com/rndudals/Design-Pattern/assets/102203336/56162a54-8b00-462f-8ce4-3a09f2f9c81c">



