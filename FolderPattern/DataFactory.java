
public class DataFactory {
	public Data createData(String type,int i, int j) {
		if ("Folder".equals(type)) {
			return new DataFolder();
		} else if ("File".equals(type)){
			return new DataFiles(i,j);
		} 
		return null;
	}

	public void accept(Visitor v) {
		v.visit((Data) this);
		
	}
}
