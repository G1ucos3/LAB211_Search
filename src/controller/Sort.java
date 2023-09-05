package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class Sort extends Menu<String>{
    static String[] mChoice = {"Sort", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Sort(Element element){
        super("Menu", mChoice);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize();
        array = element.getArray();
    }

    @Override
    public void execute(int n){
        switch(n){
            case 1:
                sort();
                break;
            case 2:
                System.exit(0);
        }
    }

    public void sort() {
        final String[] mcSort = {"Buddle Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String>{
            public SortMenu(){
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n){
                switch(n){
                    case 1:
                        System.out.println("Unsorted array: ");
                        library.display(array);
                        algorithm.bubbleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Unsorted array: ");
                        library.display(array);
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Exit!");
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
