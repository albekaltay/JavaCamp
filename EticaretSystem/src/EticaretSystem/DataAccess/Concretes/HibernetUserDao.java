package EticaretSystem.DataAccess.Concretes;

import EticaretSystem.DataAccess.Abstracts.UserDao;
import EticaretSystem.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernetUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    @Override
    public void register(User user) {

        System.out.println("Kaydınız Başarılı bir şekilde tamamlanmıştır. Teşekkürler" + user.getName() );
        users.add(user);
    }

    @Override
    public void login(User user) {
        System.out.println( "Giriş Yapıldı. Hoşgeldin " + user.getName());

    }

    @Override
    public void confirm(User user) {

        System.out.println( user.geteMail() + " email adresi onaylanmıştır. ");
        user.setVerify(true);

    }

    @Override
    public List<User> getAll() {

        return this.users;
    }
}
