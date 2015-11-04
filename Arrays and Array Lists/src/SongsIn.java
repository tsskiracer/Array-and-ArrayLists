import java.util.ArrayList;

public class SongsIn
	{
		private String title;
		private String artist;
		private int length;
		
		static int longest;
		static ArrayList<Songs> song = new ArrayList<Songs>();
		public SongsIn (String a, String t, int len)
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
			
			song.add(new Songs("Willie Nelson ", "Django and Jimmie ", 173));
			song.add(new Songs("Toby Keith ", "American Ride ", 166));
			song.add(new Songs("Avicii ", "Pure Grinding ", 172));
			song.add(new Songs("Eric Church ", "Springsteen ", 263));
			song.add(new Songs("Jack Johnson ", "Upside Down ", 209));
			
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
			System.out.println("_______________________________________________________________________________________________________________");
		}
		
		public static void removeSong()
		{
			for (int i = 0; i<song.size(); i++)
				{
					
					if ((song.get(i).getTitle().length())>(song.get(longest).getTitle().length()))
						{
						longest=i;	
						}
					song.remove(longest);
				}
			System.out.println("_______________________________________________________________________________________________________________");
		}
		
		public static void mySong()
		{
			for (int i=0; i<song.size(); i++)
				{
				song.get(0).setArtist("Trip Starkey ");
				System.out.print(song.get(i).getArtist());
				System.out.print(song.get(i).getTitle());
				System.out.println(song.get(i).getLength());
				}
			
		}
		
		public static void main(String[] args)
			{
				fillList();
				printList();
				subtractLength();
				
				mySong();
			}
	}