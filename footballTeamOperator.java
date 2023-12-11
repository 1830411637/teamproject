import java.util.Scanner;
//operating system
public class footballTeamOperator {
    //Create an array of objects about the team
    // Set the Teams array as a static variable
    private static footballTeam[] teams;

    // The constructor accepts an array of Teams that are passed
    public footballTeamOperator(footballTeam[] fti) {
        teams = fti;
    }


    //This method is used to print the information of the team
    public void print(){
        for (int i = 0; i < teams.length; i++) {
            footballTeam football=teams[i];
            System.out.println("Details of the team are as follows");
            System.out.println("The team number is:"+football.getId());
            System.out.println("The name of the team is:"+football.getTeamName());
            System.out.println("Number of World Cup winners:"+football.getAward());
            System.out.println("Number of World Cup winners:"+football.getCelebrity());
            System.out.println("The colors of the team's clothes are:" + football.getClothes());
            System.out.println("The team's fighting style is:" + football.getStyle());
            System.out.println("------------------------");
        }
    }
    //This method is used to retrieve information about a particular team
    public void search(int id) {
        for (int i = 0; i < teams.length; i++) {
            footballTeam football = teams[i];
            if (football.getId() == id) {
                System.out.println("Team details are as follows:");
                System.out.println("The team numbers are:"+football.getId());
                System.out.println("The team name is:"+football.getTeamName());
                System.out.println("Number of World Cup winners:" + football.getAward());
                System.out.println("The well-known names of the team are:" + football.getCelebrity());
                System.out.println("The colors of the team's clothes are:" + football.getClothes());
                System.out.println("The team's fighting style is:" +football.getStyle());
                return;
            }
        }
    System.out.println("There is no information on the team");
    }
    //This method is used to add team information
    public void add(Scanner sc) {
        System.out.println("Follow the prompts to add the information you want about the team you want (don't overlap with the previous team number):");
        System.out.println("Number of the team:");
        int id = sc.nextInt();
        System.out.println("Name of the team:");
        String teamName = sc.next();
        System.out.println("Number of World Cup winners:");
        int award = sc.nextInt();
        System.out.println("The well-known names of the team are:");
        String celebrity = sc.next();
        System.out.println("The colors of the team's clothes are:");
        String clothes = sc.next();
        System.out.println("The team's fighting style is:");
        String Style= sc.next();
        // Create a new team object
        footballTeam newTeam = new footballTeam(id, teamName, award, celebrity, clothes, Style);
        // Create a new array, which is 1 longer than the original array
        footballTeam[] teams1 = new footballTeam[teams.length + 1];
        // Copy the contents of the original array into the new array
        for (int j = 0; j < teams.length; j++) {
            teams1[j] = teams[j];
        }
        // Add the new team object to the end of the new array
        teams1[teams.length] = newTeam;
        // Update the original Teams array to the new array contents
        teams = teams1;
        System.out.println("Team information added successfully!");
    }
}

