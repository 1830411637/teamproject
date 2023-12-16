import java.util.Scanner;

public class  PenaltyShootout {
    public static void main(String[] args) {
        logIn lI=new logIn();
        lI.use();
        footballTeam[] teams = new footballTeam[3];
        //Add individual information for several teams
        teams[0] = new footballTeam(1, "Brazil", 5, "Neymar", "Yellow-blue", "Good at offense");
        teams[1] = new footballTeam(2, "Argentina", 3, "Messi", "Blue and white", "Good at ball control");
        teams[2] = new footballTeam(3, "Team France", 2, "Mbappe", "Blue", "Good at offense");
        footballTeamOperator teams1 = new footballTeamOperator(teams);
        Fight fight=new Fight();
        Scanner sc = new Scanner(System.in);
        //Create an endless loop to recycle the various methods
        while (true) {
            System.out.println("Team Information System");
            System.out.println("1,Get all the team information");
            System.out.println("2,Query the details of a team based on ID");
            System.out.println("3,Add team information");
            System.out.println("4,Delete team information");
            System.out.println("5,Penalty shootouts");
            System.out.println("Please enter your operation command:");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    //Printing role
                    teams1.print();
                    break;
                case 2:
                    //Query role
                    System.out.println("Please enter the ID of the team you are looking for:");
                    int id = sc.nextInt();
                    teams1.search(id);
                    break;
                case 3:
                    //Add roles
                    teams1.add(sc);
                    break;
                case 4:
                    //Delete teams
                    System.out.println("Please enter the ID of the team you want to delete:");
                    int deleteId = sc.nextInt();
                    teams1.delete(deleteId);
                    break;
                case 5:
                    //Battle system
                    System.out.println("Please select the two teams you want to play in");
                    System.out.println("Please enter the ID of the first team：");
                    int teamIndex1 = sc.nextInt();
                    System.out.println("Please enter the ID of the second team：");
                    int teamIndex2 = sc.nextInt();
                    fight.ft();
                    break;
                default:
                    System.out.println("There is a problem with the command you entered");
            }
        }
    }
}
