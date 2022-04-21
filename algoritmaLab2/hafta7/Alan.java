public class Alan{
	int length;
	int width;

	public Alan(int width, int length){
		this.width = width;
		this.length = length;
	}
	
	public int getMass(){
		return width * length;
	}
}
