import java.util.Scanner;
public class ChooseYourOwnAdventure {
	
	public static final int MAX = 1000;
	
	//Amariah Howard

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try (Scanner key = new Scanner(System.in)) {
			System.out.println("Welcome to Choose Your Own Adventure! Select 1 out of 9 Adventures to start. ");
			System.out.println("To select an Adventure type in \"Adventure\" followed by a number 1-9. Ex. Adventure1 ");
            
            String response = key.nextLine();
                    
            if (response.equalsIgnoreCase("Adventure1")) 
            {
                System.out.println("You have selected the castle path!");    
                System.out.println("You are a peasant wanting to work your way up to become elite royalty. You"
                        + " find yourself hungry, but lack enough money to buy food. \nWill you \"steal\" or \"ask for food\": ");
                
                response = key.nextLine();  // Use nextLine here
                
                if (response.equalsIgnoreCase("steal")) 
                {
                    System.out.println("You have chosen to steal the food. Guards find you and arrest you for stealing. "
                            + "You have not \nreached elite royal status. Game Over!");
                } 
                else if (response.equalsIgnoreCase("ask for food")) 
                {
                    System.out.println("You have chosen to ask for food. A woman offers you dinner at her house. She happens to work for the Queen. "
                            + "\nYou meet the Queen and live as her right hand until she passes away 10 years later. In her will, she has left \nyou as the new"
                            + " ruler of the kingdom! Will you accept? \"yes\" or \"no\": ");
                    
                    // Asking for user input again
                    response = key.nextLine();  // Use nextLine again
                    
                    if (response.equalsIgnoreCase("yes")) 
                    {
                        System.out.println("You are now the new ruler of the kingdom. Congrats! You have reached elite royal status!!!");
                    } 
                    else if (response.equalsIgnoreCase("no"))
                    {
                        System.out.println("You have rejected the throne. Therefore, you will not reach elite royal status. \nGame Over!");
                    } 
                    else {
                        System.out.println("Invalid response. Restart the Adventure!");
                        System.exit(0);
                    }
                } 
               
            }         
                		
	
		
		if(response.equalsIgnoreCase("Adventure2"))
		{				
			System.out.println("You have selected the beach path!");
			System.out.println("You begin walking towards the beach when two different women approach you. The woman in the red"
					+ " claims that if you follow her, she will lead you to an \nundiscovered part of the beach. "
					+ "The woman in the black claims the same thing. Who will you follow? \nAnswer \"woman in red\" or \"woman in black\": ");
			
			response = key.nextLine();
			
			if(response.equalsIgnoreCase("woman in black"))
			{
				System.out.println("You follow the woman in the black. OH NO! She's a shapeshifting sea witch who eats innocent souls. \n"
						+ "She eats your soul and you die. Game Over!");
				System.exit(0);
				
			}
			else if(response.equalsIgnoreCase("woman in red"))
			{
				System.out.println("You follow the woman in red. She leads you about 1/2 a mile out from the beach. As you stand in front of a 40 ft. "
						+ "wall covered in \nmoss the woman says \"We've made it!\" "
						+ "\"Do you wish to see the undiscovered part of the beach?\" Answer \"yes\" or \"no\": ");
				
				response =  key.nextLine();
			}
			if(response.equalsIgnoreCase("yes"))
			{
				System.out.println("The wall splits in half. Out comes many talking dolphins, whales, and fish. You and the woman in the red \n"
						+ "hop on a mystical creature and ride out to sea. You enjoy the rest of your day at sea with the animals! Game Over!");
			}
			else if(response.equalsIgnoreCase("no"))
			{
				System.out.println("You chose to not see the undiscovered part of the beach. The woman leaves you. On your way back to the beach,\n"
						+ "a sea witch eats your soul. Game Over!");
			}	
			else
			{
				System.out.println("Invalid Response. Restart the Adventure!");
				System.exit(0);
			}
			
		}
		
		
		if(response.equalsIgnoreCase("Adventure3"))
		{
			System.out.println("You have selected the casino path!");
			System.out.println("You enter the casino and sit down to play spin the wheel. The top prize is 1 million dollars. \n"
					+ "Will you \"spin hard right\" or \"spin hard left\"?: ");
			
			response = key.nextLine();
			
			if(response.equalsIgnoreCase("spin hard right"))
			{
				System.out.println("You spin hard right. After a few seconds, the wheel lands on lose $100,000! You are now broke!"
						+ "\nGame Over!");
				System.exit(0);
			}
			else if(response.equalsIgnoreCase("spin hard left"))
			{
				System.out.println("Just before you spin left, a fight breaks out! Will you \"watch the fight\" or \"ignore it\"?: ");
				
				response = key.nextLine();
			}
			if(response.equalsIgnoreCase("watch the fight"))
			{
				System.out.println("You chose to watch the fight. You lost your turn and $10,000 for not spinning. Game Over!");
			}
			else if(response.equalsIgnoreCase("ignore it"))
			{
				System.out.println("You chose to ignore the fight. You spin hard left and win the top prize of 1 million dollars! "
						+ "\nYou win!!");
			}
	
			else
			{
				System.out.println("Invalid response. Restart the Adventure!");
				
			}
		
		}
		
		if(response.equalsIgnoreCase("Adventure4"))
		{
			System.out.println("You have selected the mafia boss path!");
			System.out.println("You are walking on the street when 3 thugs try attacking you. Are you going to \"fight\" or \"run away\" or \"use a weapon nearby\"?: ");
			
			response = key.nextLine();
			
			if(response.equalsIgnoreCase("run away"))
			{
				System.out.println("You begin to run away from the thugs. They chase after you and tackle you to the ground. \nThey beat you"
						+ " up leaving you with many bruises and a bloody nose. They also steal your wallet. \nYou will not become the mafia boss. Game Over!");
				System.exit(0);
			}
			else if(response.equalsIgnoreCase("fight"))
			{
				System.out.println("You begin to throw punches and kicks at the thugs. You manage to knock two of them down, \n"
						+ "but the last one lands a flying kick to your face that knocks you out. You wake up with multiple bruises and a stolen wallet."
						+ "\nYou will not become the mafia boss. Game Over!");
			}
			else if(response.equalsIgnoreCase("use a weapon nearby"))
			{
				System.out.println("You pick up an empty glass bottle and smash it over one of the thug's head. You use the remaining pieces\n"
						+ "to stab the other two thugs. The thugs lie unconscious and you successfully escape! A few days later, A man approaches\n"
						+ "you insisting you work for the mafia. Will you \"accept\" or \"plot against them\"?: ");
				
				response = key.nextLine();
				
				if(response.equalsIgnoreCase("accept"))
				{
					System.out.println("You now work for the mafia. You go on a series of missions killing and hunting people for the mafia boss. You rack up alot of\n"
							+ "money fast. One day, the police find and capture the mafia boss. They also capture all his employees, including you. You have been thrown in\n"
							+ "jail and will not become the mafia boss. Game Over!");
				}
				else if(response.equalsIgnoreCase("plot against them"))
				{
					System.out.println("You are now a double-agent for the mafia. You collect intel about the mafia and report back to police. You successfully \n"
							+ "track killings and money-laundering back to the mafia. All parties involved are arrested. After this breakthrough, you've collected\n"
							+ "enough intel on how to run your own secret mafia business. You soon become a wealthy mafia boss! You win!!!");
				}
				else
				{
					System.out.println("Invalid response. Restart the Adventure.");
					System.exit(0);
				}						
				
			}	
			
		}
			if(response.equalsIgnoreCase("Adventure5"))
			{
				System.out.println("You have selected the cave path!");
				System.out.println("You are taking an afternoon hike with your friends, when you notice a giant cave. Will you \"explore it\" , \n\"ignore it\" or "
						+ "\"ask a friend to go with you\"?: ");
			
				response = key.nextLine();
			
					if(response.equalsIgnoreCase("explore it"))
					{
						System.out.println("You sneak off to explore the cave. As you walk in, you notice something shining in the corner. \n"
								+ "As you reach for it, a poisonous snake bites your hand. Leaving you to die in the cave. Game Over!");
						System.exit(0); //must add system.exit(0) to prevent running the else statement
					
						response = key.nextLine();
						
					}
					else if(response.equalsIgnoreCase("ignore it"))
					{
						System.out.println("You choose to ignore the cave. Nothing interesting happens for the rest of your hike. Game Over!");
					}
					else if(response.equalsIgnoreCase("ask a friend to go with you"))
					{
						System.out.println("You and your friend enter the cave together. You spot something shining in the corner and reach for it. Before you can,\n"
								+ "your friend yells \"WAIT!, There's a snake!\" You spot the snake and use a stick to pick it up and move it away. \n"
								+ "You swipe the dirt away and grab the shiny object. You find it to be 2 pounds of gold! Will you \"leave it\" or \"take it\"?:");
						
						response = key.nextLine();
						
						if(response.equalsIgnoreCase("leave it"))
						{
							System.out.println("You have chosen to leave the gold. You did not get any richer. Game Over!");
						}
						else if(response.equalsIgnoreCase("take it"))
						{
							System.out.println("You have chosen to take the gold. You leave your hike $60,000 richer! Game Over!");
						}
						else
						{
							System.out.println("Invalid response. Restart the Adventure.");
							System.exit(0);
						}
						
					}
					
			}
			if(response.equalsIgnoreCase("Adventure6"))
			{
				System.out.println("You have selected the escape room path!");
				System.out.println("Welcome to the escape room! Your goal is to successfully find the clue that will help you find the pin to get out. \nYou get one chance. Select a clue:"
						+ " \"water bottle\" , \"imaginary ink pen\" or \"magnifying glass\": ");
				
				response = key.nextLine();
				
				if(response.equalsIgnoreCase("water bottle"))
				{
					System.out.println("You have selected the water bottle. You open the water bottle only to find it empty. \nYou did not escape. Game Over!");
					System.exit(0);
				}
				else if(response.equalsIgnoreCase("imaginary ink pen"))
				{
					System.out.println("You have selected the imaginary ink pen. You light up the pen to see if there are any words around the room. \n"
							+ "You search high and low, but cannot find any hidden words. You did not escape. Game Over!");
					System.exit(0);
				}
				else if(response.equalsIgnoreCase("magnifying glass"))
				{
					System.out.println("You have selected magnifying glass. You use the magnifying glass to search all over the room. You\n"
							+ "soon find a tiny piece of paper in the corner that reads \"You found me! It was easy as 553 <3\". Will \nyou \"use the clue\" or"
							+ "\"ignore it\": ");
					
					response = key.nextLine();
					
					if(response.equalsIgnoreCase("use the clue"))
					{
						System.out.println("You have decided to use the clue. You type the number into the keypad and a bookshelf door opens. \n"
								+ "Congrats, you have escaped!");
					}
					else if(response.equalsIgnoreCase("ignore it"))
					{
						System.out.println("You've decided to ignore the clue. You did not escape. Game Over!");
					}
					else
					{
						System.out.println("Invalid response. Restart the Adventure.");
					}

				}
			}					
			if(response.equalsIgnoreCase("Adventure7"))
			{
				System.out.println("You have selected the shopping path!");
				System.out.println("Welcome to The Mall of Fashion! You have a budget of $1,000. You have to select 3 out of 5 items,\n"
						+ "but make sure they are within your budget. Here are the 5 items.\nItem 1: Chanel Skirt - $800"
						+ "\nItem2: Polo Sweatshirt - $200"
						+ "\nItem3: Gucci T-Shirt: $400"
						+ "\nItem4: Versace Shades - $300"
						+ "\nItem5: Gucci Earrings - $400");
				
				System.out.println("Type in the value of the first item you wish to purchase. Ex. 400: ");
				
				int firstitem = key.nextInt();
				
				response = key.nextLine();
				
				System.out.println("Type in the value of the second item you wish to purchase: ");
				
				int seconditem = key.nextInt();
				
				response = key.nextLine();
				
				System.out.println("Type in the value of the last item you wish to purchase: ");
				
				int thirditem = key.nextInt();
				
				response = key.nextLine();
				
				int total = firstitem + seconditem + thirditem;
							
				System.out.println("Your total is $" + total);
				
				
								
			if(total <= MAX)//no semicolon
			{
				System.out.println("You have budgeted wisely. Congrats! Enjoy your new items. ");
				System.exit(0);
			}
			
			
			if(total > MAX)
			{
				System.out.println("You have exceeded your budget! You may not collect your new items. Game Over!");
			}						
			
			
			else
			{
				System.out.println("Invalid Response. Restart the Adventure!");
			}
			
		}		
		if(response.equalsIgnoreCase("Adventure8"))
		{
			System.out.println("You have selected the science lab path!");
			System.out.println("A series of human look-alike robots are being stored in a science lab. The lab must remain at "
					+ "60-75 degrees \nFarenheit at all times. Work to make sure the robots don't freeze or everheat!");
						
			System.out.println("Before you leave the lab, you notice the robots malfunctioning. You look at the thermostat\n"
					+ "and realize it is on 98 degrees! What should you change it to?");
			
			int temperature = key.nextInt();
			
			response = key.nextLine();
			
			if(temperature >= 60 && temperature <=75)
			{
				System.out.println("You have successfully protected the robots from overheating or freezing! Congrats, you've been \n"
						+ "promoted to top scientist!!");
			}
			
			else if(temperature >= 76 && temperature <=99)
			{
				System.out.println("Oh no, The robots have overheated!");
				System.out.println("Your fired! Game Over!");
				System.exit(0);
			}
			else if(temperature >=0 && temperature <=60)
			{
				System.out.println("Oh no, the robots have frozen!");
				System.out.println("Your fired! Game Over!");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid response. Restart the Adventure!");
			}
			
		}	
		if(response.equalsIgnoreCase("Adventure9"))
		{
			System.out.println("You have selected the haunted house path!");
			System.out.println("You enter a haunted house and encounter two halls. One has a painting of a crow and the other has a\n"
					+ "painting of an owl. Will you walk down the hall with the \"crow painting\" or the \"owl painting\"?: ");
			
			response = key.nextLine();
			
			if(response.equalsIgnoreCase("owl painting"))
			{
				System.out.println("You begin to walk down the hall with the owl painting. A scream can be heard in the distance. You start to turn around\n"
						+ "when a giant owl snatches you and swallows you whole. You died and did not survive the haunted house.");
				System.out.println("Game Over!");
				System.exit(0);
			}
			else if(response.equalsIgnoreCase("crow painting"))
			{
				System.out.println("You begin to walk down the hall with the crow painting. A devious laugh can be heard in the distance.\n"
						+ "You can see a clown with a chainsaw approaching you. You begin to run away. Out of nowehere a giant crow \n"
						+ "appears behind you. It motions for you to follow it. Will you \"follow it\" or \"stay there\"?: ");
				
				response = key.nextLine();
			}
			if(response.equalsIgnoreCase("follow it"))
			{
				System.out.println("You hop on the crow and let it lead the way. It flies you straight out of the haunted house.\n"
						+ "You have made it out of the haunted house!");
			}
			else if(response.equalsIgnoreCase("stay there"))
			{
				System.out.println("You decide to stay. The crow flies away, leaving you to get killed by the clown. You die and do not\n"
						+ "survive the haunted house.");
				System.out.println("Game Over!");
			}
			else
			{
				System.out.println("Invalid response. Restart the Adventure.");
			}
		
		}
	
}

}
	
}