package nested.inner;
//외부 클래스
public class innerOuter {

    private static int outClassValue = 3;
    private int OutInstanceValue =2 ;

//내부클래스
    class Inner {
        private int innerInstanceValue =1;

        public void prrint() {
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스 의 인스턴스 멤버에 접근 가능, private도 접근가능
            System.out.println(OutInstanceValue);

            //외부 클래스 의 클래스 멤버에 접근 가능, private도 접근가능

            System.out.println(outClassValue);

        }
    }
}
