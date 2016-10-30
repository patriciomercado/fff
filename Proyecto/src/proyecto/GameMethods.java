public class GameMethods {

	private int numJugadores;
	private GestorDeDatos datos = new GestorDeDatos();
	
	
	public void preguntaAzar() {
		int azar=(int) (Math.random()*39+0);
		System.out.println(datos.preguntas.get(azar));
	}
	public GameMethods(){
		
	}
	

}