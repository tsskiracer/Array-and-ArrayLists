import java.util.ArrayList;

public class Songs
	{
		private String title;
		private String artist;
		private int length;
		static int temp;
		static int longest=0;
		static ArrayList<SongsIn> song = new ArrayList<SongsIn>();
		public Songs (String a, String t, int len)
		{
			title=t;
			artist=a;
			length=len;
		
		}

		public String getTitle()
			{
				return title;
			}

		public void setTitle(String title)
			{
				this.title = title;
			}

		public String getArtist()
			{
				return artist;
			}

		public void setArtist(String artist)
			{
				this.artist = artist;
			}

		public int getLength()
			{
				return length;
			}

		public void setLength(int length)
			{
				this.length = length;
			}
		public static void fillList()
			{
			
			song.add(new SongsIn("Willie Nelson ", "Django and Jimmie ", 173));
			song.add(new SongsIn("Toby Keith ", "American Ride ", 166));
			song.add(new SongsIn("Avicii ", "Pure Grinding ", 172));
			song.add(new SongsIn("Eric Church ", "Springsteen ", 263));
			song.add(new SongsIn("Jack Johnson ", "Upside Down ", 209));
			
			}
		public static void printList()
		{
			for (int i = 0; i<song.size(); i++)
				{
					System.out.print(song.get(i).getArtist());
					System.out.print(song.get(i).getTitle());
					System.out.println(song.get(i).getLength());
					
					
				}
			System.out.println("_______________________________________________________________________________________________________________");
		}
		
		public static void subtractLength()
		{
			for (int i = 0; i<song.size(); i++)
					{
						song.get(i).setLength(song.get(i).getLength()-10);
					}
		}
		
		public static void removeSong()
		{
			for (int i = song.size()-1; i>0; i--)
				{
					
					if ((song.get(i).getTitle().length())>longest)
						{
						longest=(song.get(i).getTitle().length());	
						int temp=i;
						}
					
				}
			song.remove(temp);
		}
		
		public static void mySong()
		{
			for (int i=0; i<song.size(); i++)
				{
				song.get(0).setArtist("Trip Starkey ");
				
				}
			
		}
		
		public static void main(String[] args)
			{
				fillList();
				printList();
				subtractLength();
				printList();
				removeSong();
				printList();
				mySong();
				printList();
			}
	}