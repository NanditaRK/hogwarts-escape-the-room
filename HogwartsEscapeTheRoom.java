

import java.util.*;

public class HogwartsEscapeTheRoom {
  public static void main(String[] args) {
    System.out.println("Welcome To The Hogwarts Escape Room");
    System.out.println("Remember to turn on CAPS lock for the entire duration of this game.");
    System.out.println("To Play The Hogwarts Escape Room Press Y");
    Scanner sc = new Scanner(System.in);
    String useranswer = sc.nextLine();
    boolean light = false;
    boolean lockOne = false;
    boolean lockTwo = false;
    boolean lockThree = false;
    String inventory[] = { "Empty", "Empty", "Empty" };
    if (useranswer.equals("Y")) {
      levelOne(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    } else if (useranswer != ("Y")) {
      System.exit(0);
    }

  }

  public static void levelOne(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree) {
    /*System.out.println("Please enter start time hour. Ex; 5:42 --> enter 5");
    int timeStarthour = sc.nextInt();
    System.out.println("Please enter start time minute. Ex; 5:42 --> enter 42");
    int timeStartmin = sc.nextInt();*/
    System.out.println("You are in the dungeons room with no light and no wand where you ");
    System.out.println("usually take potions with Professor Snape. But no");
    System.out.println("one is here with you and the the door in the front seems locked.");
    original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
  }

  public static void original(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree) {

    System.out.println(
        " To Look Up Press U\n To Look Down press D\n To look Right press R\n To look Left press L\n To look Forward press F\n To Look behind press B");
    useranswer = sc.nextLine();
    switch (useranswer) {
    case "U":
      System.out.println(" You look above you and see nothing as the ceiling is too dark to see in.");
      System.out.println("Would you like to: \n Look Closer press A \n Return To Your Original Position press B");
      useranswer = sc.nextLine();
      if (useranswer.equals("A") && (light == false)) {
        ceilingCloserlightFalse(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      if (useranswer.equals("A") && (light == true)) {
        ceilingCloserlightTrue(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      } else if (useranswer.equals("B")) {
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      break;
    case "D":
      System.out.println(
          "You look down at the floor and don't see anything, but that may be becuse it is dark. \nWould you like to:\n Look Closer press A\n Return To Your Original Position press B");
      useranswer = sc.nextLine();
      if (useranswer.equals("A")) {
        floorCloser(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      } else if (useranswer.equals("B")) {
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }

      break;
    case "R":
      System.out.println("You look to your right and see a painting of the old headmaster Professor Albus Dumbledore");
      System.out.println("Would you like to interact with Albus Dumbledore? (Y/N)");
      useranswer = sc.nextLine();
      if (useranswer.equals("Y")) {
        // gotta find a riddle
        
        System.out.println("When you ask Dumbledore how to get out of here he spoke a riddle. It went like this: If you drop me I’m sure to crack, but give me a smile and I’ll always smile back. What am I? Answer Carefully ");
        useranswer = sc.nextLine();
      //gotta make the answer
      
      boolean activate = false;
    
    if (useranswer.equals("Mirror") || useranswer.equals("mirror") || useranswer.equals("MIRROR")){
      System.out.println("Good Job!");
    }
    else if (useranswer != ("Mirror") || useranswer != ("mirror") || useranswer != ("MIRROR")){
     activate = !activate;
    }
while (activate == true){
  System.out.println("Try Again!");
   useranswer = sc.nextLine();
   if (useranswer.equals("Mirror") || useranswer.equals("mirror") || useranswer.equals("MIRROR")){
      activate = !activate;
    }
}
System.out.println("Remember this code: The code is 9536.");
System.out.println("You stare at the portrait of Dumbledore in amazement and realize something odd. Dumbledore's eyes seem to be glowing. WHen you touch his eyes a slit opens up in the portrait and a small device  labeled decoder is sitting inside of the portrait.");
System.out.println("Do you want to add the decoder to your inventory?(Y/N)");
useranswer = sc.nextLine();
if (useranswer.equals("Y")){
 inventory [2] = "Decoder";
 System.out.println("Decoder was added to your inventory.");
 System.out.println("You returned to your original position as there was nothing else to do.");
 original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
}
else if (useranswer.equals("N")){
  System.out.println("Decoder wasn't added to your inventory and you returned to your original position");
  original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
}   
      
      
      }
if (useranswer.equals("N")){
  original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
}
      break;
    case "L":
      System.out.println(
          "You move to your left and feel around the wall until you touch something which seems to be a switch. \nYou flick the switch, and suddenly the light turns on!");
      light = !light;
      System.out.println("You find something along the wall stuck next to the switch. it feels like gum....no wait more like wax you tke a closer look at it and realize it has a fingerprint on it.\n Would you like to keep the fingerprint wax?(Y/N)");
      useranswer = sc.nextLine();
      if (useranswer.equals("Y")){
        inventory [1] = "Fingerprint";
        System.out.println("Fingerprint was added to inventory.");
        System.out.println("You returned to your original position because there was nothing else to do");
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      else if (useranswer.equals("N")){
        System.out.println("You had nothing else to do there so you returned to your original position.");
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      System.out.println("You returned to the original position because there was nothing else to do there.");
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      break;
    case "F":
    System.out.println("You move to the front and see a small rectangle shaped thing.");
    System.out.println("Do you want to interact with it? (Y/N)");
    useranswer = sc.nextLine();
    if (useranswer.equals("Y")){
System.out.println("When you touch the screen it aasks for a passcode.");
System.out.println("Enter the correct passcode");
System.out.println("Passcode: X X X X\n [1] [2] [3]\n [4] [5] [6]\n [7] [8] [9]\n [#] [0] [*]");
useranswer = sc.nextLine();
if (useranswer.equals("9536")){
  //gotta make more code
  System.out.println("Password correct");
  System.out.println("The screen now showed a bunch of little squares. Suddenly a box appeared.");
  System.out.println(" It runs and runs but can never flee. It is often watched, yet never sees. When long it brings boredom, When short it brings fear.");
  System.out.println("You must choose the correct app to pass.");
  System.out.println("[Safari][Chrome][Calculator][Camera]\n[Photos][Notes][Pages][Keynote]\n[Maps][Drive][iCloud][Games]\n[Clock][Dropbox][Mail][Gmail]");
  System.out.println("Which app do you choose? Choose wisely you only have one try or else the phone locks.");
  useranswer = sc.nextLine();
  if (useranswer.equals("Clock")||(useranswer.equals("clock"))||(useranswer.equals("CLOCK"))){
    System.out.println("01001000 01100001 01110010 01110010 01111001 00100000 01010000 01101111 01110100 01110100 01100101 01110010 00100000 01100100 01100101 01100110 01100101 01100001 01110100 01110011 00100000 01001100 01101111 01110010 01100100 00100000 01010110 01101111 01101100 01100100 01100101 01101101 01101111 01110010 01110100 00101110");
    System.out.println("Crack the code above to get a scrambled special sentence. NOTE: THIS CAN ONLY BE DECODED WITH THE DECODER DEVICE. ** To use the decoder device type DECODER and press ENTER.");
    // gotta make more inventory stuff 
    useranswer = sc.nextLine();
    if (useranswer.equals("DECODER") || (useranswer.equals("Decoder")) || (useranswer.equals("decoder"))){
      System.out.println("You click the power button on the deocder.");
      System.out.println("Please enter the number exactly including spaces.");
      useranswer = sc.nextLine();
      if (useranswer.equals("01001000 01100001 01110010 01110010 01111001 00100000 01010000 01101111 01110100 01110100 01100101 01110010 00100000 01100100 01100101 01100110 01100101 01100001 01110100 01110011 00100000 01001100 01101111 01110010 01100100 00100000 01010110 01101111 01101100 01100100 01100101 01101101 01101111 01110010 01110100 00101110")){
        System.out.println("Please Wait....The Decoder is decoding the numbers");
        System.out.println("Sentence Decoded");
        System.out.println("Volemdort si a illainv");
        System.out.println("You put away the decoder and returned to your original position because there was nothing else to do on the decoder or here.");
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      else {
        System.out.println("Decoding failed. Please try again and make sure you have entered the right number.");
        System.out.println("You returned to the original position because you were stumped.");
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
    }
  }
}
else {
  System.out.println("Incorrect Password. Try Again.");
}
    }
    else {
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    }

      break;
    case "B":
    doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);

      break;
    default:
      System.out.println("You have not entered the right button try clicking with all CAPS.");
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    }

  }
  public static void doorUnlock(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree){
    System.out.println("You look behind you and see the locked door. On the door there are 3 different locks a 6 letter combination lock, Unscramble lock, and a fingerprint sensor. Then you may unlock the door.");
    System.out.println("Which lock do you want to complete first?\n [A.] Sentence combination lock\n [B.] Unscramble lock\n [C.] Fingerprint Sensor\n [D.] Unlock Door\n [E.] To go back to your original position");
    useranswer = sc.nextLine();
    switch (useranswer){
      case "A": System.out.println("Please enter the 6 lettter code:");
      useranswer = sc.nextLine();
      if (useranswer.equals("orfplz") || useranswer.equals("ORFPLZ")){
      System.out.println("Lock 1 unlocked");
      lockOne = !lockOne;
      System.out.println("You can unock more locks or try to open the door");
      doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      else {
        System.out.println("Incoorect combination. Please try again.");
        doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      break;
      case "B": System.out.println("Please enter the unscrambled sentence.");
      useranswer = sc.nextLine();
      if (useranswer.equals("Voldemort is a villain") || (useranswer.equals("VOLDEMORT IS A VILLAIN"))){
       System.out.println("Lock 2 unlocked");
      System.out.println("You can unlock more locks or try to open the door.");
      doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
      else{
        System.out.println("Incoorect sentence. Please try again.");
        doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }

      break;

      case "C":
     System.out.println("Enter fingerprint:");
     if (inventory [1].equals("Fingerprint")){
       System.out.println("You are about to place you thumb on the sensor then you realize you found\n the fingerprint wax so you place the fingerprint wax on your thumb then place your thimb on the sensor.");
       System.out.println("Lock 3 unlocked");
       lockThree = !lockThree;
       System.out.println("You can unlock more locks or try to open the door.");
      doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
     }
     else {
       System.out.println("Incoorect sentence. Please try again.");
        doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
     }
      break;
      case "D": System.out.println("Would you like to unlock this door?(Y/N)");
      useranswer  = sc.nextLine();
      if (useranswer.equals("Y")){
        System.out.println("Okay. Trying to unlock door...");
        if (lockOne == true && lockTwo == true && lockThree && true){
          System.out.println("Door unlocked. You step outside back into your lovely school Hogwarts. You run back to your dormitory and don't think about the room.");
          System.out.println();
                    System.out.println();
                              System.out.println();
                              System.out.println("You have finished the game!");
         /*System.out.println("Please enter end time hour. Ex; 5:42 --> enter 5");
         int endTimehour = sc.nextInt();
         System.out.println("Please enter end time minute. Ex; 5:42 --> enter 42");
         int endTimemin = sc.nextInt(); */



        }
        else{
          System.out.println("Door locked. You have not opened the locks please try again.");
          doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
        }
      }
      else if (useranswer.equals("N")){
        System.out.println("Okay you returned to unlocking the doors.");
        doorUnlock(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }

      break;
      case "E":
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      break;
      default:
      System.out.println("Sorry you didn't enter any of the previous options.");
    }
  }

  public static void ceilingCloserlightFalse(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree) {
    System.out.println("You go closer and see something faintly but cant tell what it is without a light");
    System.out.println("You returned to the original position because there was nothing else to do there.");
    original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);

  }

  public static void ceilingCloserlightTrue(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree) {
    // this will only happen if the light is on.
    System.out.println("You can see that there is a panel labeled orfplz.");
    System.out.println("You try to pry the panel with your finger but were not sucessful.\n You think to yourself that something sharp as a pen would be helpful to open this panel.");
    if (inventory[0].equals("Pen")) {
      System.out.println("You realized you have a pen and use it to pry the panel open with the pen.");
      System.out.println("When you open the panel there are only electrical circuits. This seems to be a red herring. You feel terrible you wasted your precious time on this. ");
      System.out.println("You returned to the original position because there was nothing else to do.");
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    }

else if (inventory[0].equals("empty")) {
        System.out.println("You couldn't pry open the panel with just your fingers \nso you returned to your original position.");
        original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
      }
  }

  public static void floorCloser(Scanner sc, String useranswer, String[] inventory, boolean light, boolean lockOne, boolean lockTwo, boolean lockThree) {
    System.out.println(
        "You look closer and realize something pointy. When you pick it up you find it to be what your muggle friend once showed it to you and called it a pen.");
    System.out.println("Would you like to add it to your inventory? (Y/N)");
    useranswer = sc.nextLine();
    if (useranswer.equals("Y")) {

      inventory[0] = "Pen";
      System.out.println("Pen was added to your inventory");
      System.out.println("There was nothing else to see on the floor so you returned to your original position.");
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    }
    if (useranswer.equals("N")) {
      System.out.println("Pen was not added to your inventory. And you returned to your original position");
      original(sc, useranswer, inventory, light, lockOne, lockTwo, lockThree);
    }
  }
}
