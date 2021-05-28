package EticaretSystem.Core;

import EticaretSystem.Entities.Concretes.User;
import EticaretSystem.GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {








    @Override
    public void register(User user) {

        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.register(user);

    }

    @Override
    public void login(User user) {

        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.login(user);


    }
}
