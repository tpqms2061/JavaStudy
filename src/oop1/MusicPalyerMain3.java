package oop1;
//Main1 에서
//클래스/ 메소드 도입
//클래스내 속성이 변할시에는 안에 메소드의 속성등만 바꾸면 되서 다른 것들은 안바꿔도됨

public class MusicPalyerMain3 {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        //음악플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();

        //볼륨 증가
        player.volumeUp();
        //볼룸 감소
        player.volumeDown();
        //음악플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();

    }
}
