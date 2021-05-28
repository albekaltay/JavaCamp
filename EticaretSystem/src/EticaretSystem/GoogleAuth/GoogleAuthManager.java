package EticaretSystem.GoogleAuth;

import EticaretSystem.Entities.Concretes.User;

public class GoogleAuthManager{



    public void register(User user) {

        System.out.println("Sayın " + user.getName() + " Google hasabınız ile kayıt oldunuz.");

    }

    public void login(User user) {

        System.out.println("Sayın " + user.getName() + " Google hasabınız ile giriş yaptınız.");


    }
}
