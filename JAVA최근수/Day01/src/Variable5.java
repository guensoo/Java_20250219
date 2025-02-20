public class Variable5 {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;

        // 수정 코드 작성 시작
        // a = 456;
        // b = 123;

        // a = b; = a(123)에 b(456)값을 넣음
        // a = 456, b = 456
        // b = a; = b에 a값을 넣음
        // b = 456, a = 456
        // System.out.println(a);
        // System.out.println(b);
        // 결과적으로 a의 값은 변하였지만 b의 값은 변하지 않음

        // 숫자를 사용하지 말고 변수만 사용해서 값을 바꾸세요
        int tmp = a;
        // tmp에 a의 값을 담음
        a = b;
        // a에 b의 값을 담음
        b = tmp;
        // b에 tmp값을 담음
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
