package prototype;

public class BotonFactory {

	public static Boton getInstance(Boton prototype) {

		Boton clone = new Boton();
		clone.setColor(prototype.getColor());
		clone.setWidth(prototype.getWidth());
		clone.setHeight(prototype.getHeight());
		clone.setBorderType(prototype.getBorderType());
		return clone;
	}

}
