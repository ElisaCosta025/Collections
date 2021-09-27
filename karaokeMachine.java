import java.util.Scanner;

class karaokeMachine{

	private songList S;
	private songQueue Q;

	public karaokeMachine()
	{
		this.S = new songList();
		this.Q = new songQueue();
	}

	// Function to start Karaoke Machine operations
	public void operate(){

		// Providing instructions for use of Karaoke Machine
		System.out.println("Press 1 to add song to the queue \n2 to play queue \n3 to consult queue \n4 to consult available songs sorted by name of the song \n5 to consult available songs sorted by name of the artist \nAnd 0 to end use of the Karaoke Machine");
		// Initializing Scanner to take songs
		Scanner SongInput = new Scanner(System.in);
		// Initializing Scanner to take user commands
		// Then taking first input command
		Scanner UserInput = new Scanner(System.in);
		int i = UserInput.nextInt();

		// While user isn't done
		while (i != 0)
		{
			// Checking for user commands and responding accordingly
			if (i == 1){
				String j = SongInput.nextLine();
				if (this.S.Songs.containsKey(j)){
					this.Q.Queue_Add(j);

					System.out.println("Song successfully added to queue.");
				}
				else{
					System.out.println("Please input a song in the list.");
				}
			}
			else if (i == 2){
				this.Q.Play();
			}
			else if (i == 3){
				this.Q.ConsultQueue();
			}
			else if (i == 4){
				this.S.ConsultListbyName();
			}
			else if (i == 5){
				this.S.ConsultListbyArtist();
			}
			System.out.println("\n");
			// Providing instructions for use of Karaoke Machine
			System.out.println("Press 1 to add song to the queue \n2 to play queue \n3 to consult queue \n4 to consult available songs sorted by name of the song \n5 to consult available songs sorted by name of the artist \nAnd 0 to end use of the Karaoke Machine");
			// Checking for next command
			i = UserInput.nextInt();
		}
		SongInput.close();
		UserInput.close();
	}
}