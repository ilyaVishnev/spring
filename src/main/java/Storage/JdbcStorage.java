package Storage;

import org.postgresql.ds.PGPooledConnection;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

@Component
public class JdbcStorage implements Storage {

    private PGPoolingDataSource source;
    private static Logger log = Logger.getLogger(JdbcStorage.class.getName());

    public void add(User user) {
        try (Connection connection = source.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("insert into users(name) values(?)");) {
            pstmt.setString(1, user.getName());
            pstmt.execute();
        } catch (SQLException ex) {
            log.info(ex.getMessage());
        }
    }

    public void setParameters(String dataBaseName, String user, String password) {
        source = new PGPoolingDataSource();
        source.setDataSourceName("Logistica");
        source.setServerName("localhost");
        source.setPortNumber(5432);
        source.setDatabaseName(dataBaseName);
        source.setUser(user);
        source.setPassword(password);
        source.setMaxConnections(30);
    }

    @Override
    public List<User> getList() {
        return null;
    }
}
