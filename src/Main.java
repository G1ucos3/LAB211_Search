import common.Library;
import controller.Sort;
import model.Element;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSize(library.getInt("Enter number of elements", 1, 100));
        element.setArray(library.createArray(element.size));
        new Sort(element).run();
    }
}
