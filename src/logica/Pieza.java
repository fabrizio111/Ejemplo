package logica;

public abstract class Pieza {
	private int fila;
    private int columna;
    private String nombre;
    
    

    public Pieza(int fila, int columna, String nombre) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.nombre = nombre;
	}

	public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }


    abstract boolean mover();

}



