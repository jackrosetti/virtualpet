/* Virtual Pet version 1.0.1
 * 
 * @author Jack Rosetti
 * @author Still Jack Rosetti
 */
public class VirtualPet 
{
    
    VirtualPetFace face;
    double money = 100;   
    int charisma = 1;
    int confidence = 1;
    int felonyProb = 0;
    int happiness = 15;
    double yearsRemaining = 20;
    int tiredness = 1;
    
    
    // constructor
    public VirtualPet() 
    {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
        private VirtualPetGUI gui;

    }

    public void resetGame()
    {
        money = 100;
        charisma = 1;
        confidence = 1;
        felonyProb = 0;
        happiness = 15;
        tiredness = 1;
        yearsRemaining = 20;
    }
    //Introduction
    public void start() 
    {
        gui.setImage(fh.getImage("penguinWalking"));
        gui.setText("Congratulations, you have just inherited 100 smackeroos! +
            You choose to move to New York to be the next big mogul. Can you do it?");
    }

    public void feed() 
    {
        if (hunger > 10) 
        {
            hunger = hunger - 10;
        } 
        else 
        {
            hunger = 0;
        }
        tiredness = tiredness + 2;
        if (tiredness > 15) 
        {
            face.setMessage("I'm... too... sleepy...");
            sleep();
        } 
        else 
        {
            face.setMessage("Yum, thanks");
            face.setImage("normal");
        }
    }
    
    public void exercise() 
    {
        hunger = hunger + 3;
        tiredness = tiredness + 5;
        if (tiredness > 15) 
        {
            face.setMessage("I'm... too... sleepy...");
            feed();
        }
        else if (hunger > 12) 
        {
            face.setMessage("urk, I'm too hungry!");
            face.setImage("dead");
        } 
        else 
        {   
            face.setMessage("1, 2, 3, jump.  Whew.");
            face.setImage("tired");
        }
    }
    
    public void sleep() 
    {
        hunger = hunger + 1;
        tiredness = 0;
        if (tiredness > 15 && hunger > 12) 
        {
            face.setMessage("Darn!");
            face.setImage("dead");
        }
        else 
        {
            face.setMessage("zzzzzzzzzz");
            face.setImage("asleep");
        }
    }


} // end Virtual Pet
