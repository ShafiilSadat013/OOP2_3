abstract  class GameCharacter implements CharacterActions {
    protected String name;
    protected int level;
    protected int experience;


    public GameCharacter(String name,int level,int experience){
        this.name = name;
        this.level = level;
        this.experience = experience;
    }

    public void showStats(){
        System.out.println("Name :" + name + "| Level: " + level + "| Experience :" + experience );
    }

    public void gainexperience(int points){
        experience += points;
        if(experience>=100){
            level++;
            experience -= 100;
            System.out.println("level up .." + name + "reached level:" + level);
        }
    }

    public abstract void  attack();
    public abstract void  defend();

}

public interface  CharacterActions {


    void attack();
    void defend();
    void gainexperience(int points);    
}

public class Warrior extends GameCharacter{

    public Warrior(String name,int level,int experience){

        super(name, level, experience);
        System.out.println("Character Created :" + name);
        showStats();
    }

    @Override
    public void attack(){
        System.out.println(name + "Attacked with a sword");
        gainexperience(40);
        System.out.println("Experience is 40");       
    }

    @Override
    public  void defend(){
        System.out.println(name + "defends with a sheild");
    }
}

public class Main22 {
    
    public static void main(String[] args) {
        
        Warrior argon  = new Warrior("Argon", 1, 0);
        argon.attack();
        argon.defend();
        argon.attack();
        System.out.println("Final score : ");


        argon.showStats();

    }
}
