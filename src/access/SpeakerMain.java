package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드에 직접 접근 수정");
        //speaker.volume = 200; -> private를 통해서 외부에서 접근 할수없음. 그래서 컴파일 오류나옴
        speaker.showVolume();
    }
}
