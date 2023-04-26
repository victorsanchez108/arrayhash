public class partidoej4 {
    private String equipolocal;
    private String equipovisitante;
    private int goleslocal;

    private int golesvisitante;

    public partidoej4() {
    }

    public partidoej4(String equipolocal, String equipovisitante, int goleslocal, int golesvisitante) {
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.goleslocal = goleslocal;
        this.golesvisitante = golesvisitante;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    public int getGoleslocal() {
        return goleslocal;
    }

    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }

    public int getGolesvisitante() {
        return golesvisitante;
    }

    public void setGolesvisitante(int golesvisitante) {
        this.golesvisitante = golesvisitante;
    }
}

