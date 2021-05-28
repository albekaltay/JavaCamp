package EticaretSystem.Business.Abstracts;

import EticaretSystem.Entities.Concretes.User;

public interface UserService {

     void registerWithEmail(User user);
     void loginWithEmail(User user);
     void confirm(User user);
     void registerWithGoogleAcount(User user);
     void loginWithGoogleAccount(User user);

}
