//
//public class Manuse {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Man[] manArray = new Man[10];
//		
//		for(int i = 0; i < manArray.length; i++) {
//			Man tempMan = new Man();
//			tempMan.age = i;
//			tempMan.name = "이름" + i;
//			manArray[i] = tempMan;
//		}
//		for (int i = 0; i < manArray.length; i++) {
//			manArray[i].print();
//		}
//		
//	}// 여기서 주의 할 점은 객체를 생성할 때 Man tempMan을 사용하여 지역 변수로 객체를 생성하였다가 배열에 저장했다는 점이다.
//
//	 // 이렇게 하면 for문을 돌 때마다 지역 변수는 새로 만들지만 생성 된 객체는 안전하게 배열에서 가지고 있게 된다.
//
//}
