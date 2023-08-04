package ProxyPattern.Solution;

public class Client {
    
    public static void main(String[] args) throws Exception {
        
        SongDao songDaoObj = new SongDaoProxy();

        Song someSong = new Song("some song", "some id");
        // ACCESS CONTROL
        songDaoObj.addSong("ADMIN", someSong); // song would be added as the user type is ADMIN.
        songDaoObj.deleteSong("ADMIN", "some id");
        songDaoObj.addSong("USER", someSong); // throws exception as the user is of type USER. Access control at proxy.
        // CACHING
        songDaoObj.addSong("ADMIN", someSong);
        songDaoObj.fetchSong("USER", "some id"); // suppose the song is still present in cache, the request won't go to the db but to the cache.
    }
}
