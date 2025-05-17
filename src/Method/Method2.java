package Method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 실행합니다");
        return;
    }

    public static void printFooter() {
        System.out.println("=프로그램을 종료합니다");
        return;
    } //void 가 들어간 메서드일때는 반환할 값이 없을때 사용 /ex) return sum: 같은 sum없을때
}
