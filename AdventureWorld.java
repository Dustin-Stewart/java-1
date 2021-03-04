import java.util.Scanner;

public class AdventureWorld{
   final static int NUMBER_OF_ROOMS = 9;//number of areas on my map
   final static int NORTH = 0;//column position of north is 0
   final static int EAST = 1;//column position of east is 1
   final static int WEST = 2;//column position of west is 2
   final static int SOUTH = 3;//column positon of south is 3
      
      
   public static void main(String[] args){
      Scanner direction = new Scanner(System.in);//scanner for user input
      boolean continueGame = true;//set the game to true to continue running
      String[] areaDescription = new String[NUMBER_OF_ROOMS];//makes a array for descriptions of each area
      int[][] areaExits = new int[NUMBER_OF_ROOMS][4];//2D array for the possible exits
      int roomNumber=0;//intializing the default room you get into
      
	  fillInAreaDescription(areaDescription);//fills in 1D array with Descriptions
      fillInExitArray(areaExits);//fills in 2D array with possible exits
      displayGameMenu();//displays the starting menu for possible options
      
	  
	  
      
      while(continueGame == true){
         System.out.println(areaDescription[roomNumber]);//will print out the possible choices of your room and where you are at
         System.out.println("Where would you like to go?");//ask for user input
         char whichWay = direction.next().charAt(0);//accepts Char user input

         //if north is a valid direction set the the room you enter into roomNumber
         if((whichWay == 'n' || whichWay == 'N') && areaExits[roomNumber][NORTH] != -1)
            roomNumber = areaExits[roomNumber][NORTH];
         //if east is a valid direction set the room you enter into roomNumber
         else if((whichWay == 'e' || whichWay == 'E') && areaExits[roomNumber][EAST] != -1)
            roomNumber = areaExits[roomNumber][EAST];
         //if west is a valid direction set the the room you enter into roomNumber
         else if((whichWay == 'w' || whichWay == 'W') && areaExits[roomNumber][WEST] != -1)
            roomNumber = areaExits[roomNumber][WEST];
         //if south is a valid direction set the the room you enter into roomNumber
         else if((whichWay == 's' || whichWay == 'S') && areaExits[roomNumber][SOUTH] != -1)
            roomNumber = areaExits[roomNumber][SOUTH];
         //if you quit display a quit message
         else if(whichWay == 'q' || whichWay == 'Q'){
            continueGame = false;
            System.out.println("You have quit.");
         }
         //else you have probably not entered a vaild input
         else
            System.out.println("Invaild Option");
      }
   }//end of main
   
   public static void displayGameMenu(){//displays the start up options on how to proceed
      System.out.println("Type in N or n to go North.");
      System.out.println("Type in E or e to go East.");
      System.out.println("Type in W or w to go West.");
      System.out.println("Type in S or s to go South.");
      System.out.println("Type in Q or q to quit.");
   }//end of displayGameMenu
   public static void fillInExitArray(int[][] twoDArray){//fills in the possible exits
      //Room Exit for Area[0]
      twoDArray[0][NORTH] = 3;//coresponds to north
      twoDArray[0][EAST] = 1;//corresponds to east
      twoDArray[0][WEST] = -1;//corresponds to west
      twoDArray[0][SOUTH] = -1;//corrresponds to south
      
      //Room Exits for Area[1]
      twoDArray[1][NORTH] = 4;//north
      twoDArray[1][EAST] = 2;//east
      twoDArray[1][WEST] = 0;//west
      twoDArray[1][SOUTH] = -1;//south
      
      //Room Exits for Area[2]
      twoDArray[2][NORTH] = 5;//north
      twoDArray[2][EAST] = -1;//east
      twoDArray[2][WEST] = 1;//west
      twoDArray[2][SOUTH] = -1;//south
      
      //Room Exits for Area[3]
      twoDArray[3][NORTH] = 6;//north
      twoDArray[3][EAST] = 4;//east
      twoDArray[3][WEST] = -1;//west
      twoDArray[3][SOUTH] = 0;//south
      
      //Room Exits for Area[4]
      twoDArray[4][NORTH] = 7;//north
      twoDArray[4][EAST] = 5;//east
      twoDArray[4][WEST] = 3;//west
      twoDArray[4][SOUTH] = 1;//south
      
      //Room Exits for Area[5]
      twoDArray[5][NORTH] = 8;//north
      twoDArray[5][EAST] = -1;//east
      twoDArray[5][WEST] = 4;//west
      twoDArray[5][SOUTH] = 2;//south
      
      //Room Exits for Area[6]
      twoDArray[6][NORTH] = -1;//north
      twoDArray[6][EAST] = 7;//east
      twoDArray[6][WEST] = -1;//west
      twoDArray[6][SOUTH] = 3;//south
      
      //Room Exits for Area[7]
      twoDArray[7][NORTH] = -1;//north
      twoDArray[7][EAST] = 8;//east
      twoDArray[7][WEST] = 6;//west
      twoDArray[7][SOUTH] = 4;//south
      
      //Room Exits for Area[8]
      twoDArray[8][NORTH] = -1;//north
      twoDArray[8][EAST] = -1;//east
      twoDArray[8][WEST] = 7;//west
      twoDArray[8][SOUTH] = 5;//south
      
   }//end of fillInExitArray
   public static void fillInAreaDescription(String[] array){//fills in the description of each area
      array[0] = "You are at Vendor Area 1. \nPassages lead to the north and east.";
      array[1] = "You are at the Training Ground. \nPassages lead to the west, north, and east.";
      array[2] = "You are at Vendor Area 2. \nPassages lead to the north and west.";
      array[3] = "You are at the Living Commons 1. \nPassages lead to the north, east, and south.";
      array[4] = "You are at the Castle. \nPassages lead to the north,south,east, and west.";
      array[5] = "You are at the Living Commons 2. \nPassages lead to the north,south,and west.";
      array[6] = "You are at Farm Land 1. \nPassages lead to the south and east.";
      array[7] = "You are at the Exit out of the City. \nPassages lead to the south,east, and west.";
      array[8] = "You are at Farm Land 2. \nPassages lead to the south and west.";
   }//end of fillInAreaDescription
}//end of class