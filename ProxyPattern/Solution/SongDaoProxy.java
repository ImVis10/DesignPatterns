package ProxyPattern.Solution;

public class SongDaoProxy implements SongDao {

    SongDao proxyObj;

    SongDaoProxy() {
        proxyObj = new SongDaoImpl();
    }

    @Override
    public void addSong(String userType, Song song) throws Exception {
        if (userType.equals("ADMIN")) { // ACCESS CONTROL
            proxyObj.addSong(userType, song);
            return;
        }
        throw new Exception("UNAUTHORIZED");
    }

    @Override
    public void deleteSong(String userType, String songId) throws Exception {
        if (userType.equals("ADMIN")) { // ACCESS CONTROL
            proxyObj.deleteSong(userType, songId);
            return;
        }
        throw new Exception("UNAUTHORIZED");
    }

    @Override
    public Song fetchSong(String userType, String songId) {
        /* if (time < expiryTime) { // CACHING
            fetch song from cache
        } */
        return proxyObj.fetchSong(userType, songId);
    }
    
}
