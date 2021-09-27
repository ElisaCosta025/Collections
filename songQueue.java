import java.util.ArrayList;

class songQueue{

	private ArrayList<String> Queue = new ArrayList<String>();
	
	public void Queue_Add(String NewSong){
		Queue.add(NewSong);
	}

	public void Play(){
		for(String song : Queue) 
		{
    	System.out.println("Now playing: "+song);
		}
		Queue.clear();
	}
	public void Q_Remove(String Song){
		Queue.remove(new String(Song));
	}

	// Function to print the song queue in order
	public void ConsultQueue()
	{
		for(int i = 0; i < Queue.size(); i++) 
		{
    	System.out.println(Queue.get(i));
		}
	}

}
