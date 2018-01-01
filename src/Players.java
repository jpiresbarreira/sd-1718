import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Players {

    private Map<String, Player> players;

    private final Lock locker;

    public Players() {
        players = new HashMap<>();
        locker = new ReentrantLock();
    }

    public Player signup(String username, String password) throws InvalidAccountException {
        locker.lock();

        try {
            Player p = players.get(username);

            if (p == null) {
                p = new Player(username, password);
                players.put(username, p);

                return p;
            }
            else {
                throw new InvalidAccountException();
            }
        }
        finally {
            locker.unlock();
        }
    }

    public Player login(String username, String password) throws InvalidAccountException {
        locker.lock();

        try {
            Player p = players.get(username);

            if (p != null) {
                if (p.getPassword().equals(password)) {
                    return p;
                }
                else { // Password errada
                    throw new InvalidAccountException();
                }
            }
            else { // Não existe player com username
                throw new InvalidAccountException();
            }
        }
        finally {
            locker.unlock();
        }
    }

    public void add(Player player) {
        players.put(player.getUsername(), player);
    }

    public synchronized void saveObject(String file) throws IOException {
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));

        try {
            oout.writeObject(this);
        }
        catch (IOException e) {
            throw e;
        }

        oout.flush();
        oout.close();
    }
}
