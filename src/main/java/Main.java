public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Илья";
        post.passport = "1234 №123456";
        post.patronymic = "Ильич";
        post.phone = "89008007777";
        post.surname = "Илюшин";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 3;
        post.birthday.month = 3;
        post.birthday.year = 1993;



    }
}
