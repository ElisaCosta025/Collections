import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class songList{

	public Map<String, String> Songs;

	// Add all songs to our list
	public songList()
	{
		this.Songs = new HashMap<String, String>();
		Songs.put("Zitti e Buoni", "Maneskin");
		Songs.put("Moriro da Re", "Maneskin");
		Songs.put("Bohemian Rhapsody", "Queen");
		Songs.put("Killer Queen", "Queen");
		Songs.put("Riot Van", "Arctic Monkeys");
		Songs.put("Are you Mine", "Arctic Monkeys");
		Songs.put("Rehab", "Amy Winehouse");
		Songs.put("Valerie", "Amy Winehouse");
		Songs.put("You Oughta Know", "Alanis Morissette");
		Songs.put("Ironic", "Alanis Morissette");
		Songs.put("Royals", "Lorde");
	}

	public Map<String, String> getSongList(){
		return Songs;
	}

	
	// Function for consulting and printing the song list by name of song
	public void ConsultListbyName()
	{
		// Convert HashMap into TreeMap, which is naturally ordered by Key
		TreeMap<String, String> SongsbyName = new TreeMap<String, String>(Songs);
		// Print TreeMap
		PrintList(SongsbyName);
	}


	// Function for consulting and printing the song list by name of artist
	public void ConsultListbyArtist()
	{
		// initialize new LinkedHashMap, which is ordered by insertion
		LinkedHashMap<String, String> SongsbyArtist = new LinkedHashMap<>();

		// Convert map into stream
		Songs.entrySet().stream()
			// Sort stream using Map.Entry.comparingbyValue
			// Which returns a comparator in natural order of values
			.sorted(Map.Entry.comparingByValue())
			// Using forEachOrdered to add items from the stream
			// to the LinkedHashMap in sorted order
    	.forEachOrdered(song -> SongsbyArtist.put(song.getKey(), song.getValue()));
			
		// Print LinkedHashMap
		PrintList(SongsbyArtist);
	}


	// Function for printing the Song List
	private void PrintList(Map<String, String> SongList){
		Iterator<String>itr = SongList.keySet().iterator();
		while(itr.hasNext())    
		{    
			String key=(String)itr.next();  
			System.out.println("Song: "+key+" // Artist: "+SongList.get(key));
		}
	}
}