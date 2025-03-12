public class Dog extends  Animal { // Animal 클래스를 상속받는다.

    // 기능 추가
    public void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
