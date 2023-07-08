
import java.util.*;

import java.lang.Math;
class Main {
  public static void main(String[] args) {
     //board
    int count =1;
    int[][] board = new int[10][10];//board 1

    System.out.println("\n\n\nB A T T L E S H I P \nM A D E B Y \nH U Y H U Y N H\n");
    
    
    // row length of uav ship
    System.out.println("\nWelcome to BattleShip. This is a multiplayer game for 2. Battleship is a strategic and logic guessing game. Your objective is to destroy your opponent's mothership or destroy all of their destroyers ships. Each player's fleet will have 5 ships: 1 mothership, which is the captain of the fleet and length of 4 spaces, it has no skills but is the head of the fleet, 3 destroyers with length of 3 rows , which is the ships that only capable of shooting torpedos to your oppponent's fleet, and 1 UAV ship has the length of 2, which is only capable of scanning the opponent's fleet and give the cordinate near 1 random ship location every 3 rounds.\n");
    
    System.out.println("\n* * * * * * THE BOARD* * * * * *\n\n");
    System.out.println("1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board){
      for(int y:x){
        System.out.print(y+" ");
      }
      System.out.println(count+=1);
    }
    System.out.println("\n\n* * * * * * * * PLANNING PHASE * * * * * * * * *");
    Scanner scan = new Scanner(System.in);
    System.out.println("The mothership has a length of 4 spaces, Horizontal Or Vertical placed Mothership ?");
    
    String M1 = scan.nextLine();
    
    
    while ((!M1.toLowerCase().equals("horizontal"))&&(!M1.toLowerCase().equals("vertical"))){
      System.out.println("Wrong input, Vertical or Horizontal ?");
      
      M1 = scan.nextLine();
      
    }
    System.out.println("Input vertical cordinate for the head of the mothership, player 1");
    int Mhcorx1= scan.nextInt()-1;
    
    System.out.println("Input vertical cordinate for the head of the mothership, player 1");
    int Mhcory1 = scan.nextInt()-1;

    
    
    if (M1.toLowerCase().equals("vertical")){//if vertical then user will choose between northern or southern
      
      System.out.println("Would you like the mothership to be placed vertically northern or southern.");
      scan.nextLine();
      String Mver1 = scan.nextLine();
      while ((!Mver1.toLowerCase().equals("northern"))&&(!Mver1.toLowerCase().equals("southern"))){
      System.out.println("Wrong input, Northern or Southern ?");
      
      Mver1 = scan.nextLine();
      
      }
      
      
      if(Mver1.toLowerCase().equals("northern")){//places ship on board loop if north
        for(int i=Mhcory1-3;i<=Mhcory1;i++){
          board[i][Mhcorx1]=1;
        }
      }
      else if(Mver1.toLowerCase().equals("southern")){//places ship on board loop if south
        
        for(int i=Mhcory1;i<=Mhcory1+3;i++){
          board[i][Mhcorx1]=1;
        }
      }
    }else{
      System.out.println("Would you like the mothership to be placed horizontally western or eastern.");
      scan.nextLine();
      String Mhor1 = scan.nextLine();
      while ((!Mhor1.toLowerCase().equals("western"))&&(!Mhor1.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
      Mhor1 = scan.nextLine();
      
      }
      if(Mhor1.toLowerCase().equals("western")){//places ship on board loop if western
        for(int i=Mhcorx1-3;i<=Mhcorx1;i++){
          board[Mhcory1][i]=1;
        }
      }
      else if(Mhor1.toLowerCase().equals("eastern")){//places ship on board loop if eastern
        for(int i=Mhcorx1;i<=Mhcorx1+3;i++){
          board[Mhcory1][i]=1;
        }
      }
    }
  
    System.out.println("\n* *  * *THE BOARD * * * *\n\n1 represents the mothership\n\n1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
    }
    
      
    for (int i = 1;i<4;i++){
      
      System.out.println("\nYou have 3 destroyers, each with a length of 3 spaces, with the ability of shooting 1 torpedo every round. Horizontal or Vertical placed "+i+"st Destroyer ship ?");
      String D1 = scan.nextLine();
      
      while ((!D1.toLowerCase().equals("horizontal"))&&(!D1.toLowerCase().equals("vertical"))){
      System.out.println("Vertical or Horizontal ?");
      
      D1 = scan.nextLine();
      
      }
      System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 1");
      int Dhcorx1= scan.nextInt()-1;
    
      System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
      int Dhcory1 = scan.nextInt()-1;

      if (D1.toLowerCase().equals("vertical")){
        System.out.println("Would you like the ship to be placed vertically northern or southern.");
        scan.nextLine();
        String Dver1 = scan.nextLine();
        while ((!Dver1.toLowerCase().equals("northern"))&&(!Dver1.toLowerCase().equals("southern"))){
      System.out.println("Northern or Southern ?");
      
        Dver1 = scan.nextLine();
      
        }
        
        if (Dver1.toLowerCase().equals("northern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt =0;
          while(cnt<3){
            for(int b=Dhcory1-2;b<=Dhcory1;b++){
              if (board[b][Dhcorx1]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 1");
                Dhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }
            }
          }
          
          
          for(int b=Dhcory1-2;b<=Dhcory1;b++){
            board[b][Dhcorx1]=2;
            
          }
        }
        else if (Dver1.toLowerCase().equals("southern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt =0;
          while(cnt<3){
            for(int b=Dhcory1;b<=Dhcory1+2;b++){
              if(board[b][Dhcorx1]!=0){
                
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 1");
                Dhcorx1= scan.nextInt()-1;
      
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }
            }
            
          }
          
          
          for(int a=Dhcory1;a<=Dhcory1+2;a++){
            board[a][Dhcorx1]=2;
            
          }
        }  
      }else{
        System.out.println("Would you like the ship to be placed horizontally western or eastern.");
        scan.nextLine();
        String Dhor1 = scan.nextLine();
        while ((!Dhor1.toLowerCase().equals("western"))&&(!Dhor1.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
        Dhor1 = scan.nextLine();
      
        }
        
        if(Dhor1.toLowerCase().equals("western")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcorx1-2;b<=Dhcorx1;b++){
              if (board[Dhcory1][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 1");
                Dhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
            
          }
          
          for(int q=Dhcorx1-2;q<=Dhcorx1;q++){
           
            board[Dhcory1][q]=2;
          }
        }
        else if(Dhor1.toLowerCase().equals("eastern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcorx1;b<=Dhcorx1+2;b++){
              if (board[Dhcory1][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 1");
                Dhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
            
          }
          for(int b=Dhcorx1;b<=Dhcorx1+2;b++){
           board[Dhcory1][b]=2;
           
          }
          
        }
      }
      System.out.println("\n* *  * *TARD * * * *\n\n2 represents the destroyers\n1 2 3 4 5 6 7 8 9 10");
      count=0;
      for(int[] x:board){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
      }
      

    }
    System.out.println("You have 1 UAV boat, this boat has a length of 2 spaces, with the ability of scanning the enemy fleet and giving out a random location near a random ship every 2 rounds. Horizontal or Vertical placed UAV boat ?");
    
    String U1 = scan.nextLine();
    while ((!U1.toLowerCase().equals("horizontal"))&&(!U1.toLowerCase().equals("vertical"))){
      System.out.println("Wrong input, Vertical or Horizontal ?");
      
      U1 = scan.nextLine();
      
    }
    System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
    int Uhcorx1= scan.nextInt()-1;
    
    System.out.println("Input vertical cordinate for the head of the UAV, player 1");
    int Uhcory1 = scan.nextInt()-1;
    if (U1.toLowerCase().equals("vertical")){
      
      System.out.println("Would you like the UAV to be placed vertically northern or southern.");
      scan.nextLine();
      String Uver1 = scan.nextLine();
      
      while ((!Uver1.toLowerCase().equals("northern"))&&(!Uver1.toLowerCase().equals("southern"))){
      System.out.println("Wrong input, Northern or Southern ?");
      
      Uver1 = scan.nextLine();
      
      }
      
      
      if(Uver1.toLowerCase().equals("northern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcory1-1;b<=Uhcory1;b++){
              if (board[b][Uhcorx1]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
          }
          
        }
        
        for(int i=Uhcory1-1;i<=Uhcory1;i++){
          board[i][Uhcorx1]=3;
         
        }
        
      }
      else if(Uver1.toLowerCase().equals("southern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcory1;b<=Uhcory1+1;b++){
              if (board[b][Uhcorx1]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }
          }
          
        }
        
        for(int i=Uhcory1;i<=Uhcory1+1;i++){
          board[i][Uhcorx1]=3;
        }
      }
      
    }else{
      System.out.println("Would you like the UAV to be placed horizontally western or eastern.");
      scan.nextLine();
      String Uhor1 = scan.nextLine();
      while ((!Uhor1.toLowerCase().equals("western"))&&(!Uhor1.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
      Uhor1 = scan.nextLine();
      
      }
      if(Uhor1.toLowerCase().equals("western")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcorx1-1;b<=Uhcorx1;b++){
              if (board[Uhcory1][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
          }
        }
        
        for(int i=Uhcorx1-1;i<=Uhcorx1;i++){
          board[Uhcory1][i]=3;
        }
      }
      else if(Uhor1.toLowerCase().equals("eastern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcorx1;b<=Uhcorx1+1;b++){
              if (board[Uhcory1][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx1= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory1 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
          }
          
        }
        
        for(int i=Uhcorx1;i<=Uhcorx1+1;i++){
          board[Uhcory1][i]=3;
          
        }
      }
    }
    
    System.out.println("\n* * * * * * THE BOARD* * * * * *\n\n1 represents the Mothership\n2 represents the Destroyer ships\n3 represents the UAV ship");
    System.out.println("1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
    }
    System.out.println("\n\nA NEW CHALLENGER HAS ARRIVED\n* * * * * * * PLANNING PHASE * * * *  * *");
    int[][] board2 = new int[10][10];
    System.out.println("1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board2){
        for(int y:x){
          System.out.print(y+" ");
        }
        
        count+=1;
        System.out.println(count);
      
    }
    
    System.out.println("The mothership has a length of 4 spaces, Horizontal Or Vertical placed Mothership ?");
    
    String M2 = scan.nextLine();
    
    
    while ((!M2.toLowerCase().equals("horizontal"))&&(!M2.toLowerCase().equals("vertical"))){
      System.out.println("Wrong input, Vertical or Horizontal ?");
      
      M2 = scan.nextLine();
      
    }
    System.out.println("Input horizontal cordinate for the head of the mothership, player 2");
    int Mhcorx2= scan.nextInt()-1;
    
    System.out.println("Input vertical cordinate for the head of the mothership, player 2");
    int Mhcory2 = scan.nextInt()-1;

    
    
    if (M2.toLowerCase().equals("vertical")){
      
      System.out.println("Would you like the mothership to be placed vertically northern or southern.");
      scan.nextLine();
      String Mver2 = scan.nextLine();
      while ((!Mver2.toLowerCase().equals("northern"))&&(!Mver2.toLowerCase().equals("southern"))){
      System.out.println("Wrong input, Northern or Southern ?");
      
      Mver2 = scan.nextLine();
      
      }
      
      
      if(Mver2.toLowerCase().equals("northern")){//loop to place mothership if placed northern
        for(int i=Mhcory2-3;i<=Mhcory2;i++){
          board2[i][Mhcorx2]=1;
        }
      }
      else if(Mver2.toLowerCase().equals("southern")){//loop to place mothership if placed southern
        for(int i=Mhcory2;i<=Mhcory2+3;i++){
          board2[i][Mhcorx2]=1;
        }
      }
      
    }else{
      System.out.println("Would you like the mothership to be placed horizontally western or eastern.");
      scan.nextLine();
      String Mhor2 = scan.nextLine();
      while ((!Mhor2.toLowerCase().equals("western"))&&(!Mhor2.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
      Mhor2 = scan.nextLine();
      
      }
      if(Mhor2.toLowerCase().equals("western")){//loop to place mothership if placed western
        for(int i=Mhcorx2-3;i<=Mhcorx2;i++){
          board2[Mhcory2][i]=1;
        }
      }
      else if(Mhor2.toLowerCase().equals("eastern")){//loop to place mothership if placed eastern
        for(int i=Mhcorx2;i<=Mhcorx2+3;i++){
          board2[Mhcory2][i]=1;
        }
      }
    }
    System.out.println("\n* *  * *THE BOARD * * * *\n1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board2){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
    }
    
      
    for (int i = 1;i<4;i++){
      
      System.out.println("\nYou have 3 destroyers, each with a length of 3 spaces, with the ability of shooting 1 torpedo every round. Horizontal or Vertical placed "+i+"st Destroyer ship ?");
      String D2 = scan.nextLine();
      
      while ((!D2.toLowerCase().equals("horizontal"))&&(!D2.toLowerCase().equals("vertical"))){
      System.out.println("Wrong input, Vertical or Horizontal ?");
      
      D2 = scan.nextLine();
      
      }
      System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 2");
      int Dhcorx2= scan.nextInt()-1;
    
      System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 2");
      int Dhcory2 = scan.nextInt()-1;

      if (D2.toLowerCase().equals("vertical")){
        System.out.println("Would you like the ship to be placed vertically northern or southern.");
        scan.nextLine();
        String Dver2 = scan.nextLine();
        while ((!Dver2.toLowerCase().equals("northern"))&&(!Dver2.toLowerCase().equals("southern"))){
      System.out.println("Wrong input, Northern or Southern ?");
      
        Dver2 = scan.nextLine();
      
        }
        
        if (Dver2.toLowerCase().equals("northern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcory2-2;b<=Dhcory2;b++){
              if (board2[b][Dhcorx2]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 2");
                Dhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 2");
                Dhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
          }
          for(int b=Dhcory2-2;b<=Dhcory2;b++){//place ship on the board
            board2[b][Dhcorx2]=2;
          }
        }
        else if (Dver2.toLowerCase().equals("southern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcory2;b<=Dhcory2+2;b++){
              if (board2[b][Dhcorx2]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 2");
                Dhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 2");
                Dhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
          }
          for(int a=Dhcory2;a<=Dhcory2+2;a++){//place ship on the board after the loop
            board2[a][Dhcorx2]=2;
          }
        }
      }else{
        System.out.println("Would you like the ship to be placed horizontally western or eastern.");
        scan.nextLine();
        String Dhor2 = scan.nextLine();
        while ((!Dhor2.toLowerCase().equals("western"))&&(!Dhor2.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
        Dhor2 = scan.nextLine();
      
        }
        
        if(Dhor2.toLowerCase().equals("western")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcorx2-2;b<=Dhcorx2;b++){
              if(board2[Dhcory2][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 2");
                Dhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
            
          }
          
          for(int q=Dhcorx2-2;q<=Dhcorx2;q++){//place ship on the board after the loop
           
            board2[Dhcory2][q]=2;
          }
        }
        else if(Dhor2.toLowerCase().equals("eastern")){
          int cnt=0;
          while(cnt<3){
            for(int b=Dhcorx2;b<=Dhcorx2+2;b++){
              if (board2[Dhcory2][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the"+i+" st destroyer, player 2");
                Dhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the  "+i+" st destroyer, player 1");
                Dhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
            
            }
            
          }
          
          for(int b=Dhcorx2;b<=Dhcorx2+2;b++){
           board2[Dhcory2][b]=2;
           
          }
        }
      }
      System.out.println("\n* *  * *THE BOARD * * * *\n1 2 3 4 5 6 7 8 9 10");
      count=0;
      for(int[] x:board2){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
      }
      
     
    }
    System.out.println("You have 1 UAV boat, this boat has a length of 2 spaces, with the ability of scanning the enemy fleet and giving out a random location near a random ship every 2 rounds. Horizontal or Vertical placed UAV boat ?");
    
    String U2 = scan.nextLine();
    while ((!U2.toLowerCase().equals("horizontal"))&&(!U2.toLowerCase().equals("vertical"))){
      System.out.println("Wrong input, Vertical or Horizontal ?");
      
      U2 = scan.nextLine();
      
    }
    System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
    int Uhcorx2= scan.nextInt()-1;
    
    System.out.println("Input vertical cordinate for the head of the UAV, player 1");
    int Uhcory2 = scan.nextInt()-1;
    if (U2.toLowerCase().equals("vertical")){
      
      System.out.println("Would you like the UAV to be placed vertically northern or southern.");
      scan.nextLine();
      String Uver2 = scan.nextLine();
      
      while ((!Uver2.toLowerCase().equals("northern"))&&(!Uver2.toLowerCase().equals("southern"))){
      System.out.println("Wrong input, Northern or Southern ?");
      
      Uver2 = scan.nextLine();
      
      }
      
      
      if(Uver2.toLowerCase().equals("northern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcory2-1;b<=Uhcory2;b++){
              if(board2[b][Uhcorx2]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
          }  
          
        }
        
        for(int i=Uhcory2-1;i<=Uhcory2;i++){//place ship on after the loop
          board2[i][Uhcorx2]=3;
          
        }
      }
      else if(Uver2.toLowerCase().equals("southern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcory2;b<=Uhcory2+1;b++){
              if (board2[b][Uhcorx2]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{cnt+=1;}  
            
          }
        }
        
        for(int i=Uhcory2;i<=Uhcory2+1;i++){//place ship on after the loop
          board2[i][Uhcorx2]=3;
        }
      }
      
    }else{
      System.out.println("Would you like the UAV to be placed horizontally western or eastern.");
      scan.nextLine();
      String Uhor2 = scan.nextLine();
      while ((!Uhor2.toLowerCase().equals("western"))&&(!Uhor2.toLowerCase().equals("eastern"))){
      System.out.println("Wrong input, Western or Eastern ?");
      
      Uhor2 = scan.nextLine();
      
      }
      if(Uhor2.toLowerCase().equals("western")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<2){
          for(int b=Uhcorx2-1;b<=Uhcorx2;b++){
              if (board2[Uhcory2][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{cnt+=1;} 
            
          }
        }
        
        for(int i=Uhcorx2-1;i<=Uhcorx2;i++){//place ship on after the loop
          board2[Uhcory2][i]=3;
        }
      }
      else if(Uhor2.toLowerCase().equals("eastern")){//below is the algorithm used for preventing overlapping of ships used for destroyers and uav. the algorithm compose of a major while loop outside whihc is responsible for keeping track if the boat is overalpping or not, if its overalapping then the user will be prompted to reinput the cordinates and the loop go forever until the user successfully place it without overlapping.
        int cnt=0;
        while(cnt<3){
          for(int b=Uhcorx2;b<=Uhcorx2+1;b++){
              if (board2[Uhcory2][b]!=0){
                System.out.println("There is already a ship there. Cant place it there. Please input the cordinates for the ship again.");
                System.out.println("Input horizontal cordinate for the head of the UAV, player 1");
                Uhcorx2= scan.nextInt()-1;
    
                System.out.println("Input vertical cordinate for the head of the UAV, player 1");
                Uhcory2 = scan.nextInt()-1;
                cnt=0;
                break;
              }else{
                cnt+=1;
              }  
          }
        }
        for(int i=Uhcorx2;i<=Uhcorx2+1;i++){//place ship on after the loop
          board2[Uhcory2][i]=3;
        }
      }
    }
    System.out.println("\n* * * * * * THE BOARD* * * * * *\n\n1 represents the Mothership\n2 represents the Destroyer ships\n3 represents the UAV ship");
    System.out.println("1 2 3 4 5 6 7 8 9 10");
    count=0;
    for(int[] x:board2){
        for(int y:x){
          System.out.print(y+" ");
        }
        System.out.println(count+=1);
    }
    
    count =0 ;
    System.out.println("\n\n* * * * * * BATTLE PHASE * * * * * *\nThis is the board that you will input your missle cordinates to guess where the enemy ships are:\n\n1 2 3 4 5 6 7 8 9 10");
    String[][] boardmain= new String[10][10];
    count=0;
    for(String[] x:boardmain){
      for(String y:x){
        y="~";
        System.out.print(y+" ");
      }
      System.out.println(count+=1);
    } 
    
    int[] b1={4,9,2};//player 1 accounting of ships
    int[] b2={4,9,2};//player 2 accounting of ships
    int[] score ={0,0};//score counter
    int[] b=new int[3];//var used to switch boards accoutning of ships after the end of turns
    int[][] boa= new int[10][10];//var used to switch boards and ship loation
    
    for(int r =1;r<=2;r++){//clear boad
      for(int i=0;i<boardmain.length;i++){
        Arrays.fill(boardmain[i],null);
      }
      if(r==1){//switch vars
        b=b2;
        boa=board2;
        
      }
      else if(r==2){
        b=b1;
        boa=board;
        
      }
      
      count=0;
      System.out.println("* * * * * * BATTLE PHASE * * * * * *\nWin Conditions:\n+ Sink the Mothership by hitting the mothership's 4 part, Each part hit will +100 points.\n+Sink 3 of the Destroyers with 3 part each, each part hit will +25 points\nThe UAV is capable of scanning exact location of a random ship every 3 turns, but only if the UAV is alive, hit 2 parts of the UAV to kill the UAV ship and +10 points per hit. GOOD LUCK !\n\n Player "+r+" turn\n");
      boolean wincon=true;
      
      while(wincon){//algorithm for UAV mechanism, scan a location of a random ship every 3 rounds
        for (int i =1;i<=15;i++){
          if(b[0]==0||b[1]==0||i==15){
            wincon=false;
            break;
          }
          if(b[2]>0){
            
              if(i%3==0){
                Random rando = new Random();
                
                while(true){
                  int randy = rando.nextInt(10);
                  int randx = rando.nextInt(10);
                  if(boa[randy][randx]!=0){
                    System.out.println("There is a ship near vertical cordinate: "+(randy+1)+"\nhorizontal cordinate:"+(randx+1));
                    break;
                  }
                }
              }  
          }
          System.out.println("\n"+(15-i)+" turns left\n");
          System.out.println("Player "+r+", input the horizontal cordinate of the place you want to fire your missle at ");
          int fx1 = scan.nextInt()-1;
          System.out.println("Player "+r+", input the horizontal cordinate of the place you want to fire your missle at ");
          int fy1 = scan.nextInt()-1;
          
          if(boa[fy1][fx1]==1){//score +100 if hit the mother ship and display "X" on the output screen. If all part of the mother ship destroyed, game over.
            
            System.out.println("\nThats a hit! \n");
            score[r-1] +=100;
            b[0]-=1;
            boa[fy1][fx1]=0;
            boardmain[fy1][fx1]="X";
           
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            count=0;
            for(String[] x:boardmain){
              for(String y:x){
                if(y==null){
                   y="~";
                }
                System.out.print(y+" ");
              }
              System.out.println(count+=1);
            }
            
          }
          else if(boa[fy1][fx1]==2){//score +25 if hit the destroyer, if hit all 3 destroyer(9 parts) then game over.
            System.out.println("\nThats a hit !\n");
            score[r-1]+=25;
            b[1]-=1;
            boa[fy1][fx1]=0;
            boardmain[fy1][fx1]="X";
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            count=0;
            boardmain[fy1][fx1]="X";
            for(String[] x:boardmain){
              for(String y:x){
                if(y==null){
                  y="~";
                }
                System.out.print(y+" ");
              }
              System.out.println(count+=1);
            } 
            
          }
          else if(boa[fy1][fx1]==3){//if hit the uav +10 points, if hit twice then it will stop the uav mechainism
            
            System.out.println("\nYou just sank a UAV boat !\n");
            score[r-1]+=10;
            b[2]-=1;
            boa[fy1][fx1]=0;
            boardmain[fy1][fx1]="X";
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            count=0;
            boardmain[fy1][fx1]="X";
            for(String[] x:boardmain){
              for(String y:x){
                if(y==null){
                  y="~";
                }
                System.out.print(y+" ");
              }
              System.out.println(count+=1);
            } 
            
          }
          else{
              
            
            if(boardmain[fy1][fx1]!="X"){
              System.out.println("\nThats a miss!\n");
              boardmain[fy1][fx1]="!";
            }else{
              System.out.println("\nYou already hit that spot!\n");
            }
            
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            count=0;
            for(String[] x:boardmain){
              for(String y:x){
                if(y==null){
                  y="~";
                }
                System.out.print(y+" ");
              }
              System.out.println(count+=1);
            }
            
          }
        }
        
      }
      System.out.println("\n\nScore of player "+r+": "+score[r-1]+"\n\n");
      
    }
    
    if(score[0]>score[1]){
      System.out.println("G O O D G A M E !\n\n\n* * * * * THE WINNER IS PLAYER 1 WITH "+score[0]+" POINTS ! * * * * *");
    }
    else if(score[0]<score[1]){
      System.out.println("G O O D G A M E !\n\n\n* * * * * THE WINNER IS PLAYER 2 WITH "+score[1]+" POINTS ! * * * * *");
    }
    else if(score[0]==score[1]){
      System.out.println("G O O D G A M E !\n\n\n* * * * * ITS A TIE !!! "+score[1]+" POINTS * * * * *");
    }
  } 
}
