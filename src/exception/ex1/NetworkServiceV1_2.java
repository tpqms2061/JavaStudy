package exception.ex1;



public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가


        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류다.
        if (!connectResult.equals("success")) {
            System.out.println("[네트워크 오류발생] 오류코드 : " + connectResult);
        }
        String sendResult = client.send(data);
        if(!sendResult.equals("success")){
            System.out.println("[네트워크 오류발생] 오류코드 : " + sendResult);
            return;
        }
        client.disconnet();

    }
}
