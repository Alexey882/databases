package Graphics;

public class GRAPHICS_INTERFACE {
    private MAIN_WINDOW main_window;
    public GRAPHICS_INTERFACE() {
         main_window = new MAIN_WINDOW(new COMPONENTS_MAIN_WINDOW().getArrayList());
    }
}
