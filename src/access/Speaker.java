package access;

public class Speaker {

    private int volume;  //private => 이 클래스 내부에서만 접근가능   //외부에서 설정 변경 x

    Speaker(int volume) {
        this.volume= volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할수 없습니다. 최대음량입니다.");

        }else {
            volume+=10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void volumeDown() {
        volume -=10;
        System.out.println("volumeDown 호출");

    }

    void showVolume(){
        System.out.println("현재 음량" + volume);
    }
}
