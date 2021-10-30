import java.util.Scanner;
public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int temp = 0;
			System.out.println("Welcome to NIKE Order log");
			System.out.println("HERE YOU CAN CUSTOMISE THE ORDER AND MAKE YOUR OWN PAIR OF SHOES");
			while(temp == 0) {
			System.out.println("What kind of shoe would you like to order(base price of $50 on all shoes)");
			System.out.println("1. Sports Shoes (added price = $200)");
			System.out.println("2. Running Shoes (added price = $250)");
			System.out.println("3. Sneakers (added price = $300)");
			System.out.println("4. EXIT");
			System.out.println("press 1, 2, 3 or 4");
			Scanner sc = new Scanner(System.in);
			int a;
			
			try {
				a = sc.nextInt();
				switch(a) {
					case 1:
						sportsShoes();
						System.out.println("WOULD YOU LIKE TO ORDER MORE? (ANSWER True/False)");
						boolean more_sports = true;
						more_sports = sc.nextBoolean();
						if(more_sports == true)
							break;
						else
							temp = 1;
							break;
					case 2:
						runningShoes();
						System.out.println("WOULD YOU LIKE TO ORDER MORE? (ANSWER True/False)");
						boolean more_running = true;
						more_running = sc.nextBoolean();
						if(more_running == true)
							break;
						else
							temp = 1;
							break;
					case 3:
						sneakers();
						System.out.println("WOULD YOU LIKE TO ORDER MORE? (ANSWER True/False)");
						boolean more_sneakers = true;
						more_sneakers = sc.nextBoolean();
						if(more_sneakers == true)
							break;
						else
							temp = 1;
							break;
					case 4:
						temp = 1;
						sc.close();
						break;
				}
			}
			catch(Exception s) {
				System.out.println("only press 1, 2, 3 or 4");
				return;
			}
			}
	}
	public static void sportsShoes() {
		int col = 0;
		String color = null;
		int size;
		boolean hard_sole;
		boolean designed;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color you want:");
		System.out.println("1 for red, 2 for blue, 3 for white");
		try {
			col = sc.nextInt();
			switch(col) {
			case 1:
				color = "red";
			case 2:
				color = "blue";
			case 3:
				color = "white";
			}
		}
		catch(Exception s) {
			System.out.println("only press 1, 2 or 3");
			return;
		}
		sc.nextLine();
		System.out.println("Enter the size:");
		size = sc.nextInt();
		sc.nextLine();
		System.out.println("Do you want hardsole? (will cost extra $75), answer(true/false)");
		hard_sole = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Do you want it hand-designed? (will cost extra $120), answer(true/false)");
		designed = sc.nextBoolean();
		
		SportShoe s = new SportShoe(color,size,hard_sole,designed);
		s.hardSole();
		s.designed();
		System.out.println("You ordered " + s.color + " sportshoes sized "+s.size+" and they cost $"+ s.price);
		return;
	}
	
	public static void runningShoes() {
		int col = 0;
		String color = null;
		int size;
		boolean light_sole;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color you want:");
		System.out.println("1 for red, 2 for blue, 3 for white");
		try {
			col = sc.nextInt();
			switch(col) {
			case 1:
				color = "red";
			case 2:
				color = "blue";
			case 3:
				color = "white";
			}
		}
		catch(Exception s) {
			System.out.println("only press 1, 2 or 3");
			return;
		}
		sc.nextLine();
		System.out.println("Enter the size:");
		size = sc.nextInt();
		sc.nextLine();
		System.out.println("Do you want light sole? (will cose extra $100) answer(true/false)");
		light_sole = sc.nextBoolean();
		sc.nextLine();
		RunningShoe r = new RunningShoe(color,size,light_sole);
		r.lightSole();
		System.out.println("You ordered "+ r.color + " running shoes sized "+r.size+" and they cost $"+r.price);
	}
	
	public static void sneakers() {
		int col = 0;
		String color = null;
		int size;
		boolean retro;
		boolean jordans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color you want:");
		System.out.println("1 for red, 2 for blue, 3 for white");
		try {
			col = sc.nextInt();
			switch(col) {
			case 1:
				color = "red";
			case 2:
				color = "blue";
			case 3:
				color = "white";
			}
		}
		catch(Exception s) {
			System.out.println("only press 1, 2 or 3");
			return;
		}
		sc.nextLine();
		System.out.println("Enter the size:");
		size = sc.nextInt();
		sc.nextLine();
		System.out.println("Do you want retro design? (will cost extra $100), answer(true/false)");
		retro = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Do you want Jordan branding? (will cost extra $150), answer(true/false)");
		jordans = sc.nextBoolean();
		
		Sneaker s = new Sneaker(color,size,retro,jordans);
		s.retro();
		s.jordans();
		
		System.out.println("You ordered "+s.color+" sneakers sized "+s.size+" and they cost $"+s.price);
		
	}
}