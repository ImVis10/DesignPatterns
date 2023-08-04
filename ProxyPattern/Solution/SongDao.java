package ProxyPattern.Solution;

public interface SongDao {
    public void addSong(String userType, Song song) throws Exception;
    public void deleteSong(String userType, String songId) throws Exception;
    public Song fetchSong(String userType, String songId);
}
