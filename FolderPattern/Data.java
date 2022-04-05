
public interface Data {
	public String getNomeOfData();
	public String getTypeOfData() ;
	public void printNameOfData();
	public abstract void acceptAll(Visitor v);
	public abstract void acceptType(Visitor v);
}
