package EticaretSystem.Business.Concretes;

import EticaretSystem.Business.Abstracts.UserCheckService;
import EticaretSystem.DataAccess.Abstracts.UserDao;
import EticaretSystem.Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {


    private UserDao userDao;

    public UserCheckManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean checkPassword(User user) {

        if (user.getPassword().length() < 6) {

            System.out.println("Şifre en az 6 karekter olmalıdır. ");

            return false;

        } else {

            return true;
        }


    }


    @Override
    public boolean emailRegexFormat(User user) {

        final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.geteMail());

        if (!matcher.matches()) {

            System.out.println(user.geteMail() + "Bu e-mail formatına uygun değil.");
            return false;
        } else {

            return true;
        }

    }

    @Override
    public void checkEmailSameOrDifferent(User user) {
        for (User user1 : userDao.getAll()) {


            if (user1.geteMail() == user.geteMail()) {
                System.out.println("Bu e-mail adresin sistemde kayıtlıdır, kullanamazsınız.");

            }
        }


    }

    @Override
    public boolean checkNameAndLastName(User user) {

        if (user.getName().length() < 2  || user.getLastName().length() < 2) {
            System.out.println("İsim ve soyisim en az 2 karakter olmalıdır.");
            return false;

        } else {

            return true;
        }

    }




}


