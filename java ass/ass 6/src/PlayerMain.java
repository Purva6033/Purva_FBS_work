class Player{
	protected String name;
	protected int age;
	protected String country;
	protected int matchesPlayed;
	protected int jerseyNumber;
	
	Player(String name,int age,String country,int matchesPlayed,int jerseyNumber){
		this.name=name;
		this.age=age;
		this.country=country;
		this.matchesPlayed=matchesPlayed;
		this.jerseyNumber=jerseyNumber;
	}

    void play() {
        System.out.println("Player Playing");
    }
}

class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	CricketPlayer(String name,int age,String country,int matchesPlayed,int jerseyNumber,int totalRuns,int totalWickets,String battingStyle,String bowlingStyle){
		super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalRuns=totalRuns;
		this.totalWickets=totalWickets;
		this.battingStyle=battingStyle;
		this.bowlingStyle=bowlingStyle;
	}

    void play() {
        System.out.println(name + "Player Playing");
    }
}

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	FootballPlayer(String name,int age,String country,int matchesPlayed,int jerseyNumber,int totalGoals,String playingPosition){
		super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalGoals=totalGoals;
		this.playingPosition=playingPosition;
	}
	 void play() {
	        System.out.println(name
	                + " is Playing Football");
	    }
}
 class PlayerMain {
public static void main(String[] args) {
	CricketPlayer cp=new CricketPlayer("Virat", 36,"India", 500, 18,25000, 5,"Right Handed","Right Arm");
	FootballPlayer fp = new FootballPlayer("Messi", 38,"Argentina", 900,10, 850,"Forward");
	System.out.println("\nPlayer Hierarchy:");
	System.out.println(cp.name);
	System.out.println(fp.name);
}
}
