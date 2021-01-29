package proyectoshilo;

public class HiloMaestro extends Thread {

    public Thread Hilo;
    public String nombreHilo;

    public HiloMaestro(String nombreHilo) {
        Hilo = new Thread(this, nombreHilo);
        this.nombreHilo = nombreHilo;
        Hilo.start();
    }

    public void run() {
        try {
            Thread.sleep(5000);
            Maistro.Maestro.setVisible(true);
            Maistro.txtMaestro.setText("¡Buen Dia Alumnos!");
            Thread.sleep(2000);
            Maistro.txtMaestro.setText("Hoy Realizaremos Ciclos");
            Thread.sleep(2000);
            Maistro.txtMaestro.setText("A Trabajar");
            Thread.sleep(1000);
            Maistro.txtMaestro.setText("");
            Thread.sleep(28000);
            Maistro.txtMaestro.setText("Perfecto, Pueden Salir");
        } catch (Exception e) {
            
        }
        
    }

    /*public static void main(String[] args) {
    hilo_maestro ob = new hilo_maestro();
    hilo_alumno ob1 = new hilo_alumno("Hilo 1");
    ob.start();
    try {
    ob.join();
    } catch (Exception e) {
    }
    
    ob1.start();
    
    }*/
}
