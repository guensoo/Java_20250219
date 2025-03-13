public class Animal2 {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal2 {
    @Override
    public void move() { // 오버라이딩
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal2 {
    @Override
    public void move() { // 오버라이딩
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

class Eagle extends Animal2 {
    @Override
    public void move() { // 오버라이딩
        System.out.println("독수리가 하늘로 납니다.");
    }
}