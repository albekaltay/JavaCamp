package EticaretSystem;

import EticaretSystem.Business.Abstracts.UserCheckService;
import EticaretSystem.Business.Abstracts.UserService;
import EticaretSystem.Business.Concretes.UserCheckManager;
import EticaretSystem.Business.Concretes.UserManager;

import EticaretSystem.Core.GoogleAuthManagerAdapter;
import EticaretSystem.DataAccess.Concretes.HibernetUserDao;
import EticaretSystem.Entities.Concretes.User;


public class Main {

    public static void main(String[] args) {

          UserService userService = new UserManager(new HibernetUserDao(), new UserCheckManager(new HibernetUserDao()), new GoogleAuthManagerAdapter());
          User user = new User(1,"Albek","Altay","albekaltay.aa@gmail.com","123456",true);

          userService.registerWithEmail(user);
          userService.confirm(user);
          userService.loginWithEmail(user);




    }
}
