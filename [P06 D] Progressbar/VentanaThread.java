public class VentanaThread extends Thread{
    
    private  Ventana vtn;
    
    public VentanaThread(){
        vtn = new Ventana();
    }

    @Override
    public void run(){
        vtn.setVisible(true);
    }

    public Ventana getVtn() {
        return vtn;
    }
    
}
