package prototype;

public class TestBotonPrototype {

	public static void main(String[] args) {

		Boton redBoton = BotonRegistry.getBoton("RED_BOTON");
		System.out.println(redBoton);
		
		Boton blueBoton = BotonRegistry.getBoton("BLUE_BOTON");
		System.out.println(blueBoton);
		
		Boton yellowBoton = BotonRegistry.getBoton("YELLOW_BOTON");
		System.out.println(yellowBoton);
		
		yellowBoton.setHeight(200);
		System.out.println(yellowBoton);
		
		Boton yellowBoton2 = BotonRegistry.getBoton("YELLOW_BOTON");
		System.out.println(yellowBoton2);
		
		String key = "BLACK_BOTON";
		Boton blackBoton = new Boton();
		blackBoton.setColor("Black");
		blackBoton.setWidth(70);
		blackBoton.setHeight(200);
		blackBoton.setBorderType(TypeBorderEnum.DASHED);
		
		BotonRegistry.addRegistry(key, blackBoton);
		
		Boton blackBotonClone = BotonRegistry.getBoton("BLACK_BOTON");
		System.out.println(blackBotonClone);
	}

}
