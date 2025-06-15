package exception.ex0;

public class NetworkClientV0 {


    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String Connection() {
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "success";
    }


    public String send(String data) {
        //전송 성공
        System.out.println(address + "서버에 데이터 성공:" + data);
        return "success";

    }

    public void disconnet() {
        System.out.println(address+ "서버연결 해제");
    }
}
