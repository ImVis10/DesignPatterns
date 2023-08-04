package ProxyPattern.Solution;

public class SongDaoImpl implements SongDao {

    @Override
    public void addSong(String userType, Song song) {
        // db.insert(song);
        System.out.println("Adding song: " + song.songName + " to the library");
    }

    @Override
    public void deleteSong(String userType, String songId) {
        // db.delete(songId)
        System.out.println("Deleting song with songId: " + songId + " from the library");
    }

    @Override
    public Song fetchSong(String userType, String songId) {
        // Song song = db.read(songId);
        System.out.println("Fetching song with songId: " + songId + " from the library");
        return new Song("some song", "some id");
    }
    
}
