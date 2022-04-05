
public class DataVisitor implements Visitor{
	
	@Override
	public void visit(Data data) {
		System.out.println(" "+data.getNomeOfData() + "." + data.getTypeOfData());
		
	}

	@Override
	public void visit(Data data, String type) {
		if (data.getTypeOfData().equals(type)) {
			System.out.println(" " + data.getNomeOfData() + "." + data.getTypeOfData());
		}
		
	}

}
