public abstract class UserManager {
    public void open(User user){
        System.out.println("sisteme giriş yapıldı");
    }


    public abstract void join(Student student);

    public abstract void join();
}
