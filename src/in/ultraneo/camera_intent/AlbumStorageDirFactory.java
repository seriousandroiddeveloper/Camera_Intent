package in.ultraneo.camera_intent;



import java.io.File;


abstract class AlbumStorageDirFactory {
	public abstract File getAlbumStorageDir(String albumName);
}
