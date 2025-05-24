package pack;

import pack.a.User; // 아래 풀경로가 불편하기 때문에 import - 풀경로 를 통해 패키지명을 생략하고 가능
import pack.a.User2; // => 이걸 하나로 import pack.a.* 을통해 전체 import가능

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
