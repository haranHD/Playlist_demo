import java.util.Scanner;
import java.util.TreeSet;

//parent:
class Songs{
    TreeSet<String> songs = new TreeSet<>();
    void song(){
        songs.add("nilave va");
        songs.add("wanna be yours");
        System.out.println(songs);
      
    }   
}

//child:
class Fav extends Songs{
    void fav(){
        songs.add("kanmani");
        System.out.println(songs);
    }
}

class Gym extends Songs{
    void gym(){
        songs.add("Unstoppable");
        songs.add("Believer");
        songs.add("SkyFall");
        songs.add("neeye oli");
        System.out.println(songs);
    }
}



class Inheri{
    public static void main(String[] a){
        Fav play = new Fav();
        System.out.println("Playlist:");
        play.song();
        System.out.println("Fav Songs: ");
        play.fav();
        Gym gym = new Gym();
        System.out.println("Gym Songs: ");
        gym.gym();

        
    }
}