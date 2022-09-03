import com.example.portfolio.dao.DaoFactory;
import com.example.portfolio.dao.UserDao;
import com.example.portfolio.entity.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = DaoFactory.getInstance().getUserDao();
        User user = new User();

        user.setName("Nikita");
        user.setSurname("Kuzmenok");
        user.setLogin("leonid2168@gmail.com");


        userDao.createUser(user);
    }
}

