import java.util.ArrayList;


public class DataFolder implements Data {
	String nameOfData;
	private ArrayList<Data> datas;
	private static int index = 0;
	
	String names[] = {"Main", "FolderTxt", "FolderImg", "FolderPdf"};
	
	public DataFolder() {
		setNameOfData(names[index]);
		this.datas = new ArrayList<Data>();
		index++;
	}

	public String getNomeOfData() {
		return this.nameOfData;
	}
	
	public void setNameOfData(String nameOfData) {
		this.nameOfData = nameOfData;
	}

	public void printNameOfData() {
		datas.forEach(Data::printNameOfData);
		
	}

	public void addData(Data data) {
        datas.add(data);
    }

	@Override
	public void acceptAll(Visitor v) {
		System.out.println();
		System.out.println("Name: "+this.nameOfData);
		for (Data data : this.datas) {
			data.acceptAll(v);
		}
		
	}

	@Override
	public void acceptType(Visitor v) {
		for (Data data : this.datas) {
			data.acceptType(v);
		}
		
	}

	@Override
	public String getTypeOfData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	
	
}
