package prototype;

import java.util.HashMap;
import java.util.Map;

public class BotonRegistry {
	
	private static Map <String, Boton> REGISTRY = new HashMap<>();
	
	static {
		Boton botonYellow = new Boton();
		botonYellow.setColor("Yellow");
		botonYellow.setWidth(55);
		botonYellow.setHeight(120);
		botonYellow.setBorderType(TypeBorderEnum.THICK);
		
		Boton botonRed = new Boton();
		botonRed.setColor("Red");
		botonRed.setWidth(40);
		botonRed.setHeight(100);
		botonRed.setBorderType(TypeBorderEnum.THIN);
		
		Boton botonBlue = new Boton();
		botonBlue.setColor("Blue");
		botonBlue.setWidth(30);
		botonBlue.setHeight(90);
		botonBlue.setBorderType(TypeBorderEnum.DASHED);
		
		REGISTRY.put("YELLOW_BOTON", botonYellow);
		REGISTRY.put("RED_BOTON", botonRed);
		REGISTRY.put("BLUE_BOTON", botonBlue);
	
	}
	
	
	public static Boton getBoton (String key) {
		return BotonFactory.getInstance(REGISTRY.get(key));
	}

	public static void addRegistry(String key, Boton boton) {
		REGISTRY.put(key, boton);
	}
	

}
