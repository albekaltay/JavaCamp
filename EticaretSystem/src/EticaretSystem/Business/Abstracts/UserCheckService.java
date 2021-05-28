package EticaretSystem.Business.Abstracts;

import EticaretSystem.Entities.Concretes.User;

public interface UserCheckService {

    boolean checkPassword(User user);
    boolean emailRegexFormat(User user);
    void checkEmailSameOrDifferent(User user);
    boolean checkNameAndLastName(User user);



}
