
public class StartPoint extends Building  {
private boolean startPoint;
	
	public StartPoint(String name,boolean sp) {
		super(name);
		this.startPoint=sp;
	}

	public boolean isStartPoint() {
		return startPoint;
	}

	
}
