public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("안녕하세요 저는 " + name + "입니다.");
    }
}
