package EticaretSystem.Business.Concretes;

import EticaretSystem.Business.Abstracts.UserCheckService;
import EticaretSystem.Business.Abstracts.UserService;
import EticaretSystem.Core.AuthService;
import EticaretSystem.DataAccess.Abstracts.UserDao;
import EticaretSystem.Entities.Concretes.User;



public class UserManager implements UserService {

    private UserDao userDao;
    private UserCheckService userCheckService;
    private AuthService authService;

    public UserManager(UserDao userDao,UserCheckService userCheckService, AuthService authService) {

        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.authService = authService;
    }


    @Override
    public void registerWithEmail(User user) {

        if (this.userCheckService.checkPassword(user) == false) {

            user.setVerify(false);
        }


        if (this.userCheckService.emailRegexFormat(user) == false) {

            user.setVerify(false);
        }

        this.userCheckService.checkEmailSameOrDifferent(user);


        if (this.userCheckService.checkNameAndLastName(user) == false) {

            user.setVerify(false);

        }

    }
    @Override
    public void loginWithEmail(User user) {

        if (user.isVerify() == true) {

            userDao.login(user);

        } else {

            System.out.println("Giriş Başarısız Email Adresinizi Kontrol Ediniz.");
        }

    }



    @Override
    public void confirm(User user) {

        if (user.isVerify() == true) {

            userDao.confirm(user);

        }else {

            System.out.println("Sayın " + user.getName() + " E-mail adresiniz onaylanmamıştır.");
        }

    }

    @Override
    public void registerWithGoogleAcount(User user) {

        user.setVerify(true);
        this.authService.register(user);



    }

    @Override
    public void loginWithGoogleAccount(User user) {

        if ( user.isVerify() == true) {

            this.authService.login(user);
        }else {
            System.out.println("Henüz kayıt olunmamış.");
        }

    }
}

