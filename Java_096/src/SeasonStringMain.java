
public class SeasonStringMain {

	public static void main(String[] args) {
		SeasonString season=SeasonString.AUTUMN;
		System.out.println(season.getMonth());
		System.out.println(season);		//toString-->valueOf
		//overriding ¾ÈÇÏ¸é name()
		//enum types may mot be instantiated
		//SeasonString sea=new SeasonString("Fall");	//error
		System.out.println(season.equals(SeasonString.SPRING));
		System.out.println(season.equals(SeasonString.AUTUMN));
		System.out.println(season.compareTo(SeasonString.SPRING));
		System.out.println(season.compareTo(SeasonString.SUMMER));
		System.out.println(season.compareTo(SeasonString.AUTUMN));
		System.out.println(season.compareTo(SeasonString.WINTER));
		
		System.out.println(season.ordinal());
		System.out.println(season.name());
		System.out.println(SeasonString.AUTUMN.name());
		System.out.println(SeasonString.valueOf("AUTUMN"));
		
		//:is same to in(c#)
		for(SeasonString sea:SeasonString.values()) {
			System.out.println(sea);	//Autumn (from 9 to 11)
		}
	}
}
