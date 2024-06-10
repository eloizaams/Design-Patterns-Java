package prototype;

public class Boton {

	protected String color;
	
	protected int width;
	
	protected int height;
	
	protected TypeBorderEnum borderType;

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final int getWidth() {
		return width;
	}

	public final void setWidth(int width) {
		this.width = width;
	}

	public final int getHeight() {
		return height;
	}

	public final void setHeight(int height) {
		this.height = height;
	}

	public final TypeBorderEnum getBorderType() {
		return borderType;
	}

	public final void setBorderType(TypeBorderEnum borderType) {
		this.borderType = borderType;
	}

	@Override
	public String toString() {
		return "Boton [color=" + color + ", width=" + width + ", height=" + height + ", borderType=" + borderType + "]";
	}
	
	
}
