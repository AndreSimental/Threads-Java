package proyectoshilo;

import javax.swing.DefaultListModel;

public class HiloAlumno extends Thread {

    public Thread Hilo;
    public String nombreHilo;
    DefaultListModel obj = new DefaultListModel();

    public HiloAlumno (String nombreHilo) {
        Hilo = new Thread(this, nombreHilo);
        this.nombreHilo = nombreHilo;
        Hilo.start();
    }

    public void run() {
        try {
            Thread.sleep(5000);
            Maistro.txtA1.setText("¡Buen Dia Maestro!");
            Maistro.txtA2.setText("¡Buen Dia Maestro!");
            Maistro.txtA3.setText("¡Buen Dia Maestro!");
            Maistro.txtA4.setText("¡Buen Dia Maestro!");
            Thread.sleep(2000);
            Maistro.txtA1.setText("Alumno 1");
            Maistro.txtA2.setText("Alumno 2");
            Maistro.txtA3.setText("Alumno 3");
            Maistro.txtA4.setText("Alumno 4");
            Thread.sleep(10000);
            if (nombreHilo == "Alumno 1") {
                Maistro.lista1.setVisible(true);
                try {
                    for (int i = 1; i <= 20; i++) {
                        Thread.sleep(1000);
                        obj.addElement("Ciclo " + i);
                        Maistro.lista1.setModel(obj);
                    }
                } catch (Exception e) {
                }
                Maistro.txtFin.setText("Termino el " + Hilo.getName());
            }
            if (nombreHilo == "Alumno 2") {
                Maistro.lista2.setVisible(true);
                try {
                    for (int i = 1; i <= 10; i++) {
                        Thread.sleep(1000);
                        obj.addElement("Ciclo " + i);
                        Maistro.lista2.setModel(obj);
                    }
                } catch (Exception e) {
                }
                Maistro.txtFin.setText("Termino el " + Hilo.getName());
            }
            if (nombreHilo == "Alumno 3") {
                Maistro.lista3.setVisible(true);
                try {
                    for (int i = 1; i <= 15; i++) {
                        Thread.sleep(1000);
                        obj.addElement("Ciclo " + i);
                        Maistro.lista3.setModel(obj);
                    }
                } catch (Exception e) {
                }
                Maistro.txtFin.setText("Termino el " + Hilo.getName());
            }
            if (nombreHilo == "Alumno 4") {
                Maistro.lista4.setVisible(true);
                try {
                    for (int i = 1; i <= 5; i++) {
                        Thread.sleep(1000);
                        obj.addElement("Ciclo " + i);
                        Maistro.lista4.setModel(obj);
                    }
                } catch (Exception e) {
                }
                Maistro.txtFin.setText("Termino el " + Hilo.getName());
            }
        } catch (Exception e) {
        }
    }
}
