package view;

import common.Library;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 * @param <T>
 */
public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> choice;
    Library l = new Library();

    public Menu(){
        choice = new ArrayList<>();
    }

    public Menu(String ti, String[] mc){
        title = ti;
        choice = new ArrayList<>();
        for (String s : mc) {
            choice.add((T) s);
        }
    }

    public void display(){
        System.out.println(title);
        System.out.println("-----------------------------");
        for(int i = 0; i < choice.size(); i++){
            System.out.println((i + 1) + "." + choice.get(i));
        }
        System.out.println("-----------------------------");
    }

    public int getSelected(){
        display();
        return l.getInt("Enter your choice", 1, choice.size() + 1);
    }

    public abstract void execute(int n);
    
    public void run(){
        while(true){
            int n = getSelected();
            execute(n);
            if(n > choice.size()){
                break;
            }
        }
    }
}
