public class App {
    public static void main(String[] args) {

        msPaint();
    }

    public static void msPaint() {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Select());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
