package EticaretSystem.Core;

import EticaretSystem.Entities.Concretes.User;

public interface AuthService {
    void register(User user);
    void login(User user);
}
