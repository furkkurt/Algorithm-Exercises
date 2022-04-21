public class Araba{
	int modelSene;
	String modelIsim;

	//Bir parametreli constructor
	public Araba(String modelIsim){
		this.modelIsim = modelIsim;
		System.out.println("Tek parametre");
	}	

	//İki parametreli constructor
	public Araba(int modelSene, String modelIsim){
		this.modelSene = modelSene;
		this.modelIsim = modelIsim;
		System.out.println("Çift parametre");
	}

	public void yazdir(){
		System.out.println("Model ismi: " + modelIsim);
		System.out.println("Model yılı: " + modelSene);
	}
}
