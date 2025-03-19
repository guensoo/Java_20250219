// 추상 클래스 선언
public abstract class Animal {

    // 일반 메서드
    public void eat() {
        System.out.println("이 동물은 음식을 먹습니다.");
    }
    // 추상 메서드 (구현하지 않고 선언만 함)
    public abstract void sound(); // 이 상태로 사용 불가
}

class Cat extends Animal{
    // 오버라이딩을 통해 추상메서드 구현

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
