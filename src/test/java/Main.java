import com.example.portfolio.dao.DaoFactory;
import com.example.portfolio.dao.UserDao;
import com.example.portfolio.entity.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = DaoFactory.getInstance().getUserDao();
        User user = new User();

        user.setName("Yaroslav");
        user.setSurname("Kuzmenok");
        user.setLogin("Yaric228@gmail.com");
        user.setPassword("3twfggsarw");
        user.setStatus("online");

        userDao.createUser(user);
    }
}

