package lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        UserV2 user = (UserV2) obj;
        return id.equals(user.id); //String 이므로 equals 해야됨

    }
}
