import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    static ArrayList<String> words = new ArrayList<>();
    static final int max_attempts=5;
    static int attempts=0;
    static int attempts_left=max_attempts;
    static String word,scrambled;
    static String user;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static long start_dur,end_dur;
    public static void read_wordlist() throws FileNotFoundException {
        File word_file = new File("words.txt");
        if(!word_file.exists()) {
            System.out.println("Word file not found!");
            System.exit(0);
        }
        Scanner reader = new Scanner(word_file);
        while(reader.hasNextLine()){
            String a = reader.nextLine().trim();
            if(a.isEmpty()){
                System.out.println("There can't be a blank line in the word list!!");
                System.exit(0);
            }
            words.add(a);
        }
        if(words.isEmpty()){
            System.out.println("Word list is empty.");
            System.exit(0);
        }
        reader.close();
    }
    public static void get_word(){
        word=words.get(rand.nextInt(words.size()));
    }
    public static void scramble(){
        StringBuilder temp = new StringBuilder();
        List<Character> chars = new ArrayList<>();
        for(char c: word.toCharArray())
            chars.add(c);
        Collections.shuffle(chars);
        for(char c: chars)
            temp.append(c);
        scrambled=temp.toString();
    }
    public static void welcome() throws FileNotFoundException {
        read_wordlist();
        get_word();
        scramble();
        System.out.println("Welcome to the Word Scramble Game!");
        System.out.println("A word will be picked and scrambled.");
        System.out.println("You have 5 attempts to unscramble the word");
        System.out.println("Good luck!\n");
    }
    public static void unscramble() throws InterruptedException {
        System.out.print("Unscramble the word: ");
        Thread.sleep(1000);
        System.out.print("\rUnscramble the word: "+scrambled);
        System.out.println();
        start_dur =System.currentTimeMillis();
        while(attempts<max_attempts){
            user=sc.nextLine().toLowerCase().trim();
            if(user.isEmpty()){
                System.out.println("Please enter something!");
                continue;
            }
            if(user.equals(word)){
                System.out.println("\nCongrats! You have unscrambled the word correctly!");
                end_dur=System.currentTimeMillis();
                attempts++;
                attempts_left--;
                return;
            }
            else{
                attempts++;
                attempts_left--;
                if(attempts_left>0)
                    System.out.println("Keep trying! "+attempts_left+" attempts left");
            }
        }
    }
    public static void score(){
        long diff=end_dur-start_dur;
        int time=(int)(diff/1000);
        int score;
        score=Math.max(0,(101-time-attempts)*2);
        if(attempts_left==0){
            System.out.println("\nBetter luck next time! The word was: "+word);
            System.out.println("Thanks for playing!");
            return;
        }
        System.out.println("-----------Score-----------");
        System.out.println("Time Taken: "+time+"s");
        System.out.println("Attempts Taken: "+attempts);
        System.out.println("Score: "+score);
        System.out.println("Thanks for playing!");
    }
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        welcome();
        unscramble();
        score();
    }
}