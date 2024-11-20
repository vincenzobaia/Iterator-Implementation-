import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<MusicFile> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param musicFile The file to be added.
     */
    public void addFile(MusicFile musicFile)
    {
        files.add(musicFile);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection by filename.
     * @param filename The name of the file to be listed.
     */
    public void listAllFiles() {
        Iterator<Track> it = files.iterator();
        boolean fileFound = false;

        while (it.hasNext()) {
            Track tk = it.next();
            System.out.println(tk.getDetails());
            fileFound = true;
        }

        if (!fileFound) {
            System.out.println("No files found.");
        }
    }

    /**
     * Remove a file from the collection by filename.
     * @param fileToRemove The name of the file to be removed.
     */
    public void removeFile(String fileToRemove) {
        Iterator<Track> it = files.iterator();
        boolean fileFound = false;

        while (it.hasNext()) {
            Track t = it.next();
            String fileName = t.getFileName();

            if (fileName.equals(fileToRemove)) {
                it.remove();
                fileFound = true;
                break;
            }
        }

        if (!fileFound) {
            System.out.println("File '" + fileToRemove + "' not found, cannot remove.");
        }
    }
}
