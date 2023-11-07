import org.studier.canvas.CanvasAccesser;
import schools.SchoolManager;

public class Main {
    public static void main(String[] args) {

        CanvasAccesser canvasAccesser = new CanvasAccesser();
        canvasAccesser.init();
        canvasAccesser.setSchool(SchoolManager.UTAH);
        canvasAccesser.launchSchool();

        System.out.println();

    }
}