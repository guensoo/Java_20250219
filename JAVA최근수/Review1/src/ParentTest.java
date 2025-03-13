public class ParentTest {
    public static void main(String[] args) {
        Parent pChild = new Child();
        if(pChild instanceof Child child) {
            child.show();
            // Child child2 = (Child) child;
        }
    }
}
